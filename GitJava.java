import java.io.IOException;
/* Basically init is used to created core repository for any project or program one want to
 * without it one cannot create git tree and commit 
 */
public class GitJava {
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("Usage: java Git.java <command> [args]");//if the argument or input given is blank
            System.out.println("-- Available commands: init --");
            return;
        }
        String command=args[0];
        try{
            switch(command){
                case "init":
                    InitCommand.init();//use init function 
                    break;
                default:
                    System.err.println("Error: Unknown command '" + command + "'");
                    System.out.println("Usage: java Git.java <command> [args]");
                    System.out.println("-- Available commands: init --");
            }
        } catch (IOException e) {
            System.err.println("Error occurred during command execution: " + e.getMessage());
        }
    }
}
