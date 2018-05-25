package chapter12;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * 12.12 从 Web 上读取数据
 */
public class ReadFileFromURL {
    public static void main(String[] args) {
        System.out.print("Enter a URL: ");
        // 读取控制台输入的网址
        String URLString = new Scanner(System.in).next();

        try {
            URL url = new URL(URLString);
            Scanner scanner = new Scanner(url.openStream());
            int count = 0;
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                count += line.length();
            }
            System.out.println("The file size is " + count + " characters");
        } catch (MalformedURLException ex) {
            System.out.println("Invalid URL");
        } catch (IOException ex) {
            System.out.println("IO Errors");
        }
    }
}
