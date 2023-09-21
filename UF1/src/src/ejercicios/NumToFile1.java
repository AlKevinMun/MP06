package ejercicios;

import java.io.File;
import java.io.PrintWriter;
public class NumToFile1 {
        public static void main(String[] args)  throws Exception {
            // Indicate that you are planning to use a file
            File fleExample = new File("Num11001200.txt");
            // Create that file and prepare to write some values to it
            PrintWriter pwInput = new PrintWriter(fleExample);
                for (int i=1100;i<=1200;i++){
                    pwInput.println(i);
                }
            pwInput.close();


        }
    }

