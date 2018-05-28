package ch7_7;

import java.time.*;
import java.time.format.*;

/**
 * 7.7.2 使用 DateTimeFormatter 解析字符串
 */
public class NewFormatterParse {
    public static void main(String[] args) {
        // 定义一个任意格式的日期时间字符串
        String str = "2014 年 04 月 12 日 01 时 06 分 09 秒";
        // 根据需要解析的日期、时间字符串定义解析所用的格式器
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy 年 MM 月 dd 日 HH 时 mm 分 ss 秒");
        // 执行解析
        LocalDateTime dateTime = LocalDateTime.parse(str, formatter);
        System.out.println(dateTime); // 2014-04-12T01:06:09
    }
}
