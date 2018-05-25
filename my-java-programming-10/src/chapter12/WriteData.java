package chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * 12.11.1 使用 PrintWriter 写数据
 */

public class WriteData {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("scores.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        }

        /*PrintWriter writer = new PrintWriter(file);
        writer.print("John T Smith ");
        writer.println(90);
        writer.print("Eric K Jones ");
        writer.println(85);
        writer.close();*/

        /**
         * 12.11.2 使用 try-with-resources 自动关闭资源
         */
        try (PrintWriter writer = new PrintWriter(file);) {
            writer.print("John T Smith ");
            writer.println(90);
            writer.print("Eric K Jones ");
            writer.println(85);
        }
    }
}