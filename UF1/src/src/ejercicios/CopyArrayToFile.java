package ejercicios;
import java.io.*;

public class CopyArrayToFile {
    public static void main(String[] args) {
        String[] text = {"Angel", "Estel", "Ona"};
        File file = new File(System.getProperty("user.dir") + File.separator + "noms.txt");

        saveFile(text,file);
        showFile(file);
    }
        public static void saveFile(String[] text, File file) {
            try {
                FileWriter fw = new FileWriter(file, false);
                BufferedWriter bw = new BufferedWriter(fw);

                for (String t : text) {
                    bw.write(t);
                    bw.newLine();
                }
                bw.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public static void showFile(File file){
            try {
                BufferedReader inputStream = new BufferedReader(new FileReader(file));

                String line = "";

                while ((line = inputStream.readLine()) != null) {
                    System.out.println(line);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

