package ch16_4;

/**
 * 16.4.5 改变线程优先级
 */
public class PriorityTest extends Thread {

    public PriorityTest(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + " 我现在的优先级是："
                    + this.getPriority() + " 变量i的值：" + i);
        }
    }

    public static void main(String[] args) {
        // 改变主线程的优先级
        Thread.currentThread().setPriority(6);

        for (int i = 0; i < 30; i++) {
            if (i == 10) {
                PriorityTest low = new PriorityTest("我是低优先级线程");
                low.start();
                System.out.println(low.getName() + " 创建之初的优先级：" // 跟父线程（主线程）的优先级相同
                        + low.getPriority());
                // 设置该线程为最低优先级
                low.setPriority(Thread.MIN_PRIORITY);
            }
            if (i == 20) {
                PriorityTest high = new PriorityTest("==== 我是高优先级线程");
                high.start();
                System.out.println(high.getName() + " 创建之初的优先级："
                        + high.getPriority());
                // 设置该线程为最高优先级
                high.setPriority(Thread.MAX_PRIORITY);
            }
        }
    }
}
