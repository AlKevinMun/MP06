package ejercicios;

import java.io.File;
import java.util.Scanner;
public class CharsFileToScreen1 {

    public static void main(String[] args)  throws Exception {
        // Indicate that you are planning to opena file
        File fleExample = new File("alphabeta.txt");
        // Prepare a Scanner that will "scan" the document
        Scanner opnScanner = new Scanner(fleExample);

        while(opnScanner.hasNext()){
            System.out.print(opnScanner.nextLine().toUpperCase()+" ");
        }
        opnScanner.close();
    }
}

