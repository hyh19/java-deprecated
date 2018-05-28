package ch7_6;

import java.text.*;
import java.util.*;

/**
 * 7.6.8 使用 SimpleDateFormat 格式化日期
 */
public class SimpleDateFormatTest {

    public static void main(String[] args) throws ParseException {

        Date date = new Date();
        // 格式化日期对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(simpleDateFormat.format(date));

        simpleDateFormat = new SimpleDateFormat("G yyyy 年的第 D 天");
        System.out.println(simpleDateFormat.format(date));

        // 解析日期字符串
        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(simpleDateFormat.parse("2018-05-28"));
        simpleDateFormat = new SimpleDateFormat("y###MMM##d");
        System.out.println(simpleDateFormat.parse("14###三月##21"));
    }
}