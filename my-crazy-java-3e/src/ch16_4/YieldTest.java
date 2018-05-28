package ch16_4;

/**
 * 16.4.4 线程让步：yield
 */
public class YieldTest extends Thread {

    public YieldTest(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ": " + i);
            // 当i等于20时，使用yield方法让当前线程让步。
            if (i == 20) {
                Thread.yield();
            }
        }
    }

    public static void main(String[] args) {
        YieldTest yt1 = new YieldTest("==== 高优先级线程");
        // 将ty1线程设置成最高优先级
        yt1.setPriority(Thread.MAX_PRIORITY); // 一个线程让步了，另外一个相同或更高优先级的线程将会获得执行机会，如果优先级低，将不会执行。
        yt1.start();

        YieldTest yt2 = new YieldTest("低优先级线程");
        // 将yt2线程设置成最低优先级
        yt2.setPriority(Thread.MIN_PRIORITY);
        yt2.start();
    }
}
