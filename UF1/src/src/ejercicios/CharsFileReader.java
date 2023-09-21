package ejercicios;

import  java.io.*;
public class CharsFileReader {
    public static void main(String[] args) {

        try {

            BufferedReader inputStream = new BufferedReader(new FileReader(new File("alphabeta5465.txt")));
            BufferedWriter outputStream = new BufferedWriter(new FileWriter(new File("Alphabeta5465Dos.txt"), false));

            int c = inputStream.read();

            while (c != -1) {
                //System.out.print((char) c);
                outputStream.write((char) c);
                c = inputStream.read();
            }

            inputStream.close();
            outputStream.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
