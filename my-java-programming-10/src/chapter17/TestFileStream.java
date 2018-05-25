package chapter17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 17.4.1 FileInputStream 和 FileOutputStream
 */
public class TestFileStream {
    public static void main(String[] args) throws IOException {
        try (FileOutputStream output = new FileOutputStream("temp.dat")) {
            // 只能写入 0-255 的整数
            for (int i = 0; i <= 255; i++) {
                output.write(i);
            }
        }

        try (FileInputStream input = new FileInputStream("temp.dat")) {
            int value;
            while ((value = input.read()) != -1) {
                System.out.print(value + " ");
            }
        }
    }
}