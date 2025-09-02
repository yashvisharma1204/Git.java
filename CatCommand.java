import java.io.IOException;
import java.nio.file.*;
public class CatCommand {
    public static void cat_command_simple(String filename) throws IOException{
        Path path = Paths.get(filename);
        if(!Files.exists(path)){
            System.out.println("Error: File not found: " + filename);
            return;
        }
        byte data[] = Files.readAllBytes(path);
        System.out.write(data);
        System.out.println();
    }
}
