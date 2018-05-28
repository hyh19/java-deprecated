package ch7_4;

import java.util.Date;

/**
 * 7.4.1 Date 类
 */
public class DateTest {
    public static void main(String[] args) {
        Date d1 = new Date();
        // 获取当前时间之后 100ms 的时间
        Date d2 = new Date(System.currentTimeMillis() + 100);
        System.out.println(d2);
        // 比较时间，返回数字。
        System.out.println(d1.compareTo(d2));
        // 比较时间，返回布尔值。
        System.out.println(d1.before(d2));
    }
}
