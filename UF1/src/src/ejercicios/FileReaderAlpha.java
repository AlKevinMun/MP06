package ejercicios;

import java.io.*;

public class FileReaderAlpha {

    public static void main(String[] args) {

        try {

            BufferedReader inputStream = new BufferedReader(new FileReader(new File("alphabeta5465.txt")));

            String line = "";

            while ((line = inputStream.readLine()) != null) {
                for (int i = 0; i < line.length(); i++) {
                    System.out.print(line.toUpperCase().charAt(i) + " ");
                }
            }

            inputStream.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}