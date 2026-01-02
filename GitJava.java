import java.io.IOException;
/* Basically init is used to created core repository for any project or program one want to
 * without it one cannot create git tree and commit.
 */
public class GitJava {
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("  /$$$$$$  /$$   /$$           /$$$$$                              \r\n" + //
                                " /$$__  $$|__/  | $$          |__  $$                              \r\n" + //
                                "| $$  \\__/ /$$ /$$$$$$           | $$  /$$$$$$  /$$    /$$ /$$$$$$ \r\n" + //
                                "| $$ /$$$$| $$|_  $$_/           | $$ |____  $$|  $$  /$$/|____  $$\r\n" + //
                                "| $$|_  $$| $$  | $$        /$$  | $$  /$$$$$$$ \\  $$/$$/  /$$$$$$$\r\n" + //
                                "| $$  \\ $$| $$  | $$ /$$   | $$  | $$ /$$__  $$  \\  $$$/  /$$__  $$\r\n" + //
                                "|  $$$$$$/| $$  |  $$$$//$$|  $$$$$$/|  $$$$$$$   \\  $/  |  $$$$$$$\r\n" + //
                                " \\______/ |__/   \\___/ |__/ \\______/  \\_______/    \\_/    \\_______/\r\n" + //
                                "                                                                   \r\n" + //

                                "                                                                   ");
            System.out.println("Usage: java GitJava <command> [args]"); //if the argument or input given is blank
                    System.out.println("---------------------- Available commands --------------------------");
                    System.out.println("       init                Initializes an empty GitJava repository.");
                    System.out.println("       cat-file-simple     Displays the contents of a regular file.");
                    System.out.println("       cat-file <hash>     Displays the contents of a Git object.");
                    System.out.println("--------------------------------------------------------------------");
            return;
        }
        String command=args[0];
        try{
            switch(command){
                case "init":
                    InitCommand.init();//use init function 
                    break;
                case "cat-file-simple":
                    if (args.length < 2) {
                        System.err.println("Error: Missing file path.");
                        System.out.println("Usage: java GitJava cat-file-simple <file-path>");
                    } else {
                        CatCommand.cat_command_simple(args[1]);
                    }
                    break;
                default:
                    System.err.println("Error: Unknown command '" + command + "'");
                    System.out.println("Usage: java GitJava <command> [args]");
                    System.out.println("---------------------- Available commands ------------------------");
                    System.out.println("    init                Initializes an empty GitJava repository.");
                    System.out.println("    cat-file-simple     Displays the contents of a regular file.");
                    System.out.println("    cat-file <hash>     Displays the contents of a Git object.");
                    System.out.println("----------------------------------------------------------------");
            }
        } catch (IOException e) {
            System.err.println("Error occurred during command execution: " + e.getMessage());
        }
    }
}
