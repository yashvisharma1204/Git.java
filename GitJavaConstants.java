
public class GitJavaConstants{
    public static final String GIT_DIR = ".gitjava"; // name of main directory that will contain all the data !!impo
    public static final String OBJECTS_DIR = "objects"; //subdirectory inside .gitjava which will conatin all commits and trees will be stored 
    public static final String HEAD_FILE = "HEAD"; // refernce point to current branch you working (just like head in linked list)
    public static final String INDEX_FILE = "index"; // acts like a stage area for adding a new file 
    public static final String REFS_DIR = "refs/heads"; // as written stores references to the differebt commits and files
}