package ejercicios;

import java.io.*;
import java.util.Scanner;

public class CSVToScreen {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader inputStream = new BufferedReader(new FileReader(new File("users.csv")));

        try {
            String line = "";
            int i = 1;
            while ((line = inputStream.readLine()) != null) {
                String[] parts = line.split(",");

                System.out.print("Persona "+i);
                System.out.println();
                System.out.print("firstname: "+parts[0]);
                System.out.println();
                System.out.print("lastname: "+parts[1]);
                System.out.println();
                System.out.print("username: "+parts[2]);
                System.out.println();
                System.out.print("password: "+parts[3]);
                System.out.println();
                System.out.println("email: "+parts[4]);
                System.out.println("****");

                i++;
            }

        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}