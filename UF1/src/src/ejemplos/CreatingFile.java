package ejemplos;
import java.io.File;
import java.io.PrintWriter;

public class CreatingFile {
    public static void main(String[] args)  throws Exception {
        // Indicate that you are planning to use a file
        File fleExample = new File("Example.xpl");
        // Create that file and prepare to write some values to it
        PrintWriter pwInput = new PrintWriter(fleExample);
    }
}