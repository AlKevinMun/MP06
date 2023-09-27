package ejemplos;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class WriteEven {
    public static void main(String[] args) {
        try {
            FileOutputStream file = new FileOutputStream("out/production/MP06/ejemplos/even.dat");
            DataOutputStream data = new DataOutputStream(file);

            for (int i = 0; i < 25 ; i++) {
                data.writeInt(i*2);
            }

            data.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}