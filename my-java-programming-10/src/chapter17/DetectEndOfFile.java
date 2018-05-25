package chapter17;

import java.io.*;

/**
 * 17.4.3 DataInputStream 和 DataOutputStream
 * 程序清单 17-3 检测文件的末尾
 */
public class DetectEndOfFile {
    public static void main(String[] args) {
        try {
            try (DataOutputStream output =
                         new DataOutputStream(new FileOutputStream("test.dat"))) {
                output.writeDouble(4.5);
                output.writeDouble(43.25);
                output.writeDouble(3.2);
            }

            try (DataInputStream input =
                         new DataInputStream(new FileInputStream("test.dat"))) {
                while (true)
                    System.out.println(input.readDouble());
            }
        } catch (EOFException ex) {
            System.out.println("All data were read");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
