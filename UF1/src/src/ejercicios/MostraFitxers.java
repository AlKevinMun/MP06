package ejercicios;

import java.io.File;
import java.util.Scanner;

public class MostraFitxers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserta la ruta que quieres listar: ");
        String ruta = scanner.nextLine();

        System.out.println("Muestra los ficheros en la ruta dada:");
        File f = new File(ruta);

        File[] files = f.listFiles();

        for (File ficheros : files){
            if (ficheros.canRead()){
                System.out.print(ficheros.isDirectory() ? "d" : "_");
                System.out.print(ficheros.canRead() ? "r" : "_");
                System.out.print(ficheros.canWrite() ? "w" : "_");
                System.out.print(ficheros.canExecute() ? "x" : "_");
                System.out.println(" " + ficheros.getName());
            }
        }
    }
}
