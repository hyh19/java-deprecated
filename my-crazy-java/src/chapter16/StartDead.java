package chapter16;

public class StartDead extends Thread {

    private int i;

    public void run() {
        for (; i < 100; i++) {
            System.out.println(getName() + ": " + i);
        }
    }

    public static void main(String[] args) {
        StartDead sd = new StartDead();
        for (int i = 0; i < 300; i++) {
            System.out.println(Thread.currentThread().getName()
                    + ": " + i);
            if (i == 20) {
                sd.start();
                // 判断启动后线程的isAlive()值，输出true。
                System.out.println("isAlive: " + sd.isAlive());
            }
            // 只有当线程处于新建、死亡两种状态时，isAlive()方法返回false。
            // 当i > 20，则该线程肯定已经启动过了，如果sd.isAlive()为假时，那只能是死亡状态了。
            if (i > 20 && !sd.isAlive()) {
                // 试图再次启动该线程
                sd.start();
            }
        }
    }
}
