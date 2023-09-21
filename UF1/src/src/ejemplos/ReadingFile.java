package ejemplos;

import java.io.File;
import java.util.Scanner;
public class ReadingFile {

    public static void main(String[] args)  throws Exception {
        // Indicate that you are planning to opena file
        File fleExample = new File("Example.xpl");
        // Prepare a Scanner that will "scan" the document
        Scanner opnScanner = new Scanner(fleExample);

        // Read each line in the file
        while(opnScanner.hasNext()) {
            // Read each line and display its value
            System.out.println("First Name:    " + opnScanner.nextLine());
            System.out.println("Last Name:     " + opnScanner.nextLine());
            System.out.println("Hourly Salary: " + opnScanner.nextLine());
            System.out.println("Is Full Time?: " + opnScanner.nextLine());
        }
    }
    }

