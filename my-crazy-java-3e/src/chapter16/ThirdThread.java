package chapter16;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThirdThread {

    public static void main(String[] args) {

        ThirdThread thirdThread = new ThirdThread();

        // 先使用Lambda表达式创建Callable<Integer>对象，然后使用FutureTask来包装。
        FutureTask<Integer> futureTask = new FutureTask<Integer>(() -> {
            int i = 0;
            for (; i < 100; i++) {
                System.out.println(Thread.currentThread().getName()
                        + ": " + i);
            }
            return i;
        });

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()
                    + ": " + i);
            if (i == 20) {
                // 实质还是以Callable对象来创建并启动线程。
                new Thread(futureTask, "我是有返回值的线程").start();
            }
        }

        // 获取线程返回值
        try {
            System.out.println(futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}