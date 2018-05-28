package ch7_6;

import java.util.*;
import java.text.*;

import static java.text.DateFormat.*;

/**
 * 7.6.7 使用 DateFormat 格式化日期、时间
 */
public class DateFormatTest {

    public static void main(String[] args) throws Exception {

        Date date = new Date();

        System.out.println("---- 中国日期格式 ----");
        DateFormat dateFormat = DateFormat.getDateInstance(SHORT, Locale.CHINA);
        System.out.println(dateFormat.format(date));

        dateFormat = DateFormat.getDateInstance(MEDIUM, Locale.CHINA);
        System.out.println(dateFormat.format(date));

        dateFormat = DateFormat.getDateInstance(LONG, Locale.CHINA);
        System.out.println(dateFormat.format(date));

        dateFormat = DateFormat.getDateInstance(FULL, Locale.CHINA);
        System.out.println(dateFormat.format(date));

        System.out.println("---- 美国日期格式 ----");
        dateFormat = DateFormat.getDateInstance(SHORT, Locale.US);
        System.out.println(dateFormat.format(date));

        dateFormat = DateFormat.getDateInstance(MEDIUM, Locale.US);
        System.out.println(dateFormat.format(date));

        dateFormat = DateFormat.getDateInstance(LONG, Locale.US);
        System.out.println(dateFormat.format(date));

        dateFormat = DateFormat.getDateInstance(FULL, Locale.US);
        System.out.println(dateFormat.format(date));

        System.out.println("---- 解析日期字符串 ----");
        String str1 = "2014-12-12";
        String str2 = "2014年12月10日";
        System.out.println(DateFormat.getDateInstance().parse(str1));
        System.out.println(DateFormat.getDateInstance(LONG).parse(str2));
    }
}
