package ch7_4;

import java.util.*;

import static java.util.Calendar.*;

/**
 * 7.4.2 Calendar 类
 * 设置 Calendar 的容错性
 */
public class LenientTest {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        // 默认开启容错，结果是 YEAR 字段加 1，MONTH 字段为1（二月）。
        cal.set(MONTH, 13);
        System.out.println(cal.getTime());
        // 关闭容错
        cal.setLenient(false);
        // 导致运行时异常
        cal.set(MONTH, 13); // Exception in thread "main" java.lang.IllegalArgumentException: MONTH
        System.out.println(cal.getTime());
    }
}