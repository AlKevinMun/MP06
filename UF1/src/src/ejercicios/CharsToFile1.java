package ejercicios;

import java.io.File;
import java.io.PrintWriter;
public class CharsToFile1 {

    public static void main(String[] args)  throws Exception {
        // Indicate that you are planning to use a file
        File fleExample = new File("alphabeta.txt");
        // Create that file and prepare to write some values to it
        PrintWriter pwInput = new PrintWriter(fleExample);
        for (int i=97;i<=122;i++){
            pwInput.println((char) i);
        }
        pwInput.close();


    }
}



