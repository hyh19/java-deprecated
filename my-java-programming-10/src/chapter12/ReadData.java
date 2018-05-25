package chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 12.11.3 使用 Scanner 读数据
 */
public class ReadData {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("scores.txt");
        try (Scanner scanner = new Scanner(file);) {
            while (scanner.hasNext()) {
                String firstName = scanner.next();
                String mi = scanner.next();
                String lastName = scanner.next();
                int score = scanner.nextInt();
                System.out.println(firstName + " " + mi + " " + lastName + " " + score);
            }
        }
    }
}
