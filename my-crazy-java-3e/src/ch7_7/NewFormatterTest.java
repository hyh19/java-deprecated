package ch7_7;

import java.time.*;
import java.time.format.*;

/**
 * 7.7.1 使用 DateTimeFormatter 完成格式化
 */
public class NewFormatterTest {

    public static void main(String[] args) {

        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter;

        System.out.println("---- 直接使用常量创建 DateTimeFormatter 格式器 ----");
        formatter = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(formatter.format(date));
        System.out.println(date.format(formatter));

        formatter = DateTimeFormatter.ISO_LOCAL_TIME;
        System.out.println(formatter.format(date));
        System.out.println(date.format(formatter));

        formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        System.out.println(formatter.format(date));
        System.out.println(date.format(formatter));

        System.out.println("---- 使用本地化的不同风格创建 DateTimeFormatter 格式器 ----");
        formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM);
        System.out.println(formatter.format(date));
        System.out.println(date.format(formatter));

        formatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG);
        System.out.println(formatter.format(date));
        System.out.println(date.format(formatter));

        System.out.println("---- 根据模式字符串创建 DateTimeFormatter 格式器 ----");
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(formatter.format(date));
        System.out.println(date.format(formatter));
    }
}
