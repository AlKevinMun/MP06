package ejercicios;
import java.io.*;

public class CopyFilesFRFW {
    public static void main(String[] args) {
    try {
        BufferedReader inputStream = new BufferedReader(new FileReader(new File("alphabeta5465.txt")));
        BufferedWriter outputStream = new BufferedWriter(new FileWriter(new File("copyAlphabeta5465.txt"), false));

        String line="";
        while ((line = inputStream.readLine()) != null) {
            outputStream.write(line+"\n");
        }
        inputStream.close();
        outputStream.close();


        inputStream.close();

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
