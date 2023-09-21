package ejercicios;
import java.io.*;
public class ComptaVocals {
    public static void main(String[] args) {
        try{
            BufferedReader inputStream = new BufferedReader(new FileReader(new File("letras")));
            BufferedWriter outputStream = new BufferedWriter(new FileWriter(new File("contanVocals.csv"), false));

            String line = "";
            int a,e,i,o,u;

            outputStream.write("a,e,i,o,u");
            outputStream.newLine();

            while((line = inputStream.readLine()) != null){
                line = line.toLowerCase();
                a = 0; e = 0; i = 0; o = 0; u = 0;
                for (int j = 0; j < line.length(); j++) {
                    switch (line.charAt(j)){
                        case 'a':
                            a++;
                            break;
                        case 'e':
                            e++;
                            break;
                        case 'i':
                            i++;
                            break;
                        case 'o':
                            o++;
                            break;
                        case 'u':
                            u++;
                            break;
                    }
                }
                outputStream.write(a + "," + e + "," + i + "," + o + "," + u);
                outputStream.newLine();
            }

            inputStream.close();
            outputStream.close();
            }
        catch (IOException e){
        e.printStackTrace();
        }

    }
}
