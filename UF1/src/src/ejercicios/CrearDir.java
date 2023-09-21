package ejercicios;

import java.io.File;
import java.util.Scanner;

public class CrearDir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserta la ruta del directorio a crear");
        String ruta = scanner.nextLine();

        System.out.println("Inserta el nombre del directorio a crear");
        String nombre = scanner.nextLine();

        File dir = new File(ruta +File.separator + nombre);
        dir.mkdirs();

        if (dir.exists()){
            System.out.print("Ya existe el directorio");
        }
        else {
            System.out.println("Creado con exito");
        }
    }
}
