package ejercicios;

import java.io.*;

public class CopyFilesBin {

    public static void main(String[] args)  {

        try {
            int data;
            DataInputStream input = new DataInputStream(new FileInputStream( "Danganronpa.full.2884006.jpg"));
            DataOutputStream output = new DataOutputStream(new FileOutputStream("copia.jpg"));

            while ((data = input.read()) != -1) {
                output.write(data);
            }


        } catch(EOFException e) {
            System.out.println("Final de fichero.");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}