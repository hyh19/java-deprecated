package ch16_4;

import java.util.Date;

/**
 * 16.4.3 线程睡眠：sleep
 */
public class SleepTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("当前时间：" + new Date());
            // 调用sleep方法让当前线程暂停一秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
