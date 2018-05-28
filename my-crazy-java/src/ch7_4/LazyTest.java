package ch7_4;

import java.util.*;

import static java.util.Calendar.*;

/**
 * 7.4.2 Calendar 类
 * set 方法延迟修改
 */
public class LazyTest {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        // 2003-08-31
        cal.set(2003, 7, 31);
        // 将月份设为 9，但 9 月 31 日不存在。如果立即修改，系统将会把 cal 自动调整到 10 月 1 日，月份是 10。
        cal.set(MONTH, 8);
        // System.out.println(cal.getTime());
        // 设置 DATE 字段为 5，如果取消上面的注释，下面的修改会把时间变成 2003-10-05。
        cal.set(DATE, 5); // 只有最后一次修改实际生效
        System.out.println(cal.getTime()); // 2003-09-05
    }
}