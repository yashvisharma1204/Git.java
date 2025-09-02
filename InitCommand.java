import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class InitCommand {
    public static void init() throws IOException {
        Path repoPath = Paths.get(GitJavaConstants.GIT_DIR);
        if (Files.exists(repoPath)) {
            System.out.println("MiniGit repository already exists.");
            return;
        }
        System.out.println("Initializing empty Git.java repository...");
        Files.createDirectory(repoPath);
        Files.createDirectory(repoPath.resolve(GitJavaConstants.OBJECTS_DIR));
        Files.createDirectory(repoPath.resolve("refs"));
        Files.createDirectory(repoPath.resolve(GitJavaConstants.REFS_DIR));
        Files.write(repoPath.resolve(GitJavaConstants.HEAD_FILE), "ref: refs/heads/main".getBytes());
        Files.createFile(repoPath.resolve(GitJavaConstants.INDEX_FILE));
        System.out.println("--- Initialized repository successfully in --- " + repoPath.toAbsolutePath());
    }
}
