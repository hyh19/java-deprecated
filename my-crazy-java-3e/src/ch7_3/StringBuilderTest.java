package ch7_3;

/**
 * 7.3.3 String、StringBuffer 和 StringBuilder 类
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        // 追加
        System.out.println("---- append ----");
        stringBuilder.append("java");
        System.out.println(stringBuilder);
        // 插入
        System.out.println("---- insert ----");
        stringBuilder.insert(0, "hello ");
        System.out.println(stringBuilder);
        // 替换
        System.out.println("---- replace ----");
        stringBuilder.replace(5, 6, ",");
        System.out.println(stringBuilder);
        // 删除
        System.out.println("---- delete ----");
        stringBuilder.delete(5, 6);
        System.out.println(stringBuilder);
        // 反转
        System.out.println("---- reverse ----");
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        // 获取长度
        System.out.println("---- length ----");
        System.out.println(stringBuilder.length());
        // 获取容量
        System.out.println("---- capacity ----");
        System.out.println(stringBuilder.capacity());
        // 改变长度
        System.out.println("---- setLength ----");
        stringBuilder.setLength(5);
        System.out.println(stringBuilder);
    }
}