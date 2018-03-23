package ch16_4;

public class DaemonThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(getName() + ": " + i);
        }
    }

    public static void main(String[] args) {
        DaemonThread t = new DaemonThread();
        // 将此线程设置成后台线程
        t.setDaemon(true);
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()
                    + ": " + i);
        }
        // 程序执行到此处，前台线程（main线程）结束，后台线程也应该随之结束。
    }
}
