package ejemplos;

import java.io.File;
import java.io.PrintWriter;
public class WritenFile {

        public static void main(String[] args)  throws Exception {
            // Indicate that you are planning to use a file
            File fleExample = new File("Example.xpl");
            // Create that file and prepare to write some values to it
            PrintWriter pwInput = new PrintWriter(fleExample);

            // Write a string to the file
            pwInput.println("Francine");
            // Write a string to the file
            pwInput.println("Mukoko");
            // Write a double-precision number to the file
            pwInput.println(22.85);
            // Write a Boolean value to the file
            pwInput.print(true);
            // After using the PrintWriter object, de-allocated its memory
            pwInput.close();
            // For convenience, let the user know that the file has been created
            System.out.println("The file has been created.");
        }
    }

