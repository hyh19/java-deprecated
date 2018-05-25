package ch16_8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 16.8.1 Java 8 改进的线程池
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(6);
        // 使用Lambda表达式创建Runnable对象
        Runnable target = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName()
                        + ": " + i);
            }
        };
        // 向线程池中提交两个线程
        pool.submit(target);
        pool.submit(target);
        // 关闭线程池，不再提交线程。
        pool.shutdown();
    }
}
