package ejercicios;
import java.io.*;
import java.util.*;



public class RecordsTextToCSV {
    static ArrayList<String>nombre,apellido,edad;
    public static void main(String[] args) {
        nombre = new ArrayList<String>();
        apellido = new ArrayList<String>();
        edad = new ArrayList<String>();

        llegeixFitxer(new File("personas.txt"));
        mostraPerPantalla();
        escriuSortidaCSV(new File("personas.csv"));
    }

    public static void llegeixFitxer(File f){
        try{
            BufferedReader inputStream = new BufferedReader(new FileReader(f));

            String line = "";
            while((line = inputStream.readLine()) != null){
                nombre.add(line);
                line = inputStream.readLine();
                apellido.add(line);
                line = inputStream.readLine();
                edad.add(line);
                line = inputStream.readLine();
            }
            inputStream.close();

        } catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void mostraPerPantalla(){
        System.out.println("nombre, apellido, edad");

        for (int i = 0; i < nombre.size() ; i++) {
            System.out.print(nombre.get(i));
            System.out.print(",");
            System.out.print(apellido.get(i));
            System.out.print(",");
            System.out.print(edad.get(i));
            System.out.println();
        }
    }

    public static void escriuSortidaCSV(File f){
        try{
            BufferedWriter outputStream = new BufferedWriter( new FileWriter(f));

            outputStream.write("nombre,apellido,edad");
            outputStream.newLine();

            for (int i = 0; i < nombre.size(); i++) {
                outputStream.write(nombre.get(i));
                outputStream.write(",");
                outputStream.write(apellido.get(i));
                outputStream.write(",");
                outputStream.write(edad.get(i));
                outputStream.newLine();
            }
            outputStream.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
