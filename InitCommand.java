import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class InitCommand {
    public static void init() throws IOException {
        Path repoPath = Paths.get(GitJavaConstants.GIT_DIR); // basically to create object of "Path" to locate the file and create desired directory
        if (Files.exists(repoPath)) {
            System.out.println("GitJava repository already exists.");
            return;
        }
        System.out.println("Initializing empty Git.java repository...");
        Files.createDirectory(repoPath);//creates directory within repo
        Files.createDirectory(repoPath.resolve(GitJavaConstants.OBJECTS_DIR)); //takes object path and creates object directory within repoPath as subdirectory to store objects
        Files.createDirectory(repoPath.resolve("refs"));//takes refs path and creates refs directory within repoPath as subdirectory to store refernces
        Files.createDirectory(repoPath.resolve(GitJavaConstants.REFS_DIR));
        Files.write(repoPath.resolve(GitJavaConstants.HEAD_FILE), "ref: refs/heads/main".getBytes());
        Files.createFile(repoPath.resolve(GitJavaConstants.INDEX_FILE));
        System.out.println(" Initialized repository successfully in ---> " + repoPath.toAbsolutePath());
    }
}


