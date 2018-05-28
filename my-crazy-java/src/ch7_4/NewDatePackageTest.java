package ch7_4;

import java.time.*;

/**
 * 7.4.3 Java 8 新增的日期、时间包
 */
public class NewDatePackageTest {

    public static void main(String[] args) {

        System.out.println("---- Clock ----");
        Clock clock = Clock.systemUTC();
        System.out.println(clock.instant()); // 2018-05-28T03:21:55.564Z
        // 时间戳，与 System.currentTimeMillis 相同。
        System.out.println(clock.millis()); // 1527477715631
        System.out.println(System.currentTimeMillis()); // 1527477715631

        System.out.println("---- Duration ----");
        // 6000 秒
        Duration duration = Duration.ofSeconds(6000);
        // 转换为分钟
        System.out.println(duration.toMinutes() + " 分钟");
        // 小时，注意，只保留整数部分。
        System.out.println(duration.toHours() + " 小时"); // 1
        // 天，同上。
        System.out.println(duration.toDays() + " 天"); // 0
        // 6000 秒后的时间
        System.out.println(Clock.offset(clock, duration).instant());

        System.out.println("---- Instant ----");
        Instant instant1 = Instant.now();
        System.out.println("当前时间 " + instant1);
        // 6000 秒后
        Instant instant2 = instant1.plusSeconds(6000);
        System.out.println("6000 秒后 " + instant2);
        // 根据字符串解析 Instant 对象
        Instant instant3 = Instant.parse("2014-02-23T10:12:35.342Z");
        System.out.println("解析 Instant 对象" + instant3);
        // 5 小时 4 分钟后
        Instant instant4 = instant3.plus(Duration
                .ofHours(5).plusMinutes(4));
        System.out.println("5 小时 4 分钟后 " + instant4);
        // 5 天前
        Instant instant5 = instant4.minus(Duration.ofDays(5));
        System.out.println("5 天前 " + instant5);

        System.out.println("---- LocalDate ----");
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        // 2014 年的第 146 天
        localDate = LocalDate.ofYearDay(2014, 146);
        System.out.println(localDate); // 2014-05-26
        // 设置具体日期
        localDate = LocalDate.of(2014, Month.MAY, 21);
        System.out.println(localDate); // 2014-05-21

        System.out.println("---- LocalTime ----");
        // 获取当前时间
        LocalTime localTime = LocalTime.now();
        // 设置具体时间
        localTime = LocalTime.of(22, 33);
        System.out.println(localTime); // 22:33
        // 返回一天中的第 5503 秒
        localTime = LocalTime.ofSecondOfDay(5503);
        System.out.println(localTime); // 01:31:43

        System.out.println("---- LocalDateTime ----");
        // 获取当前日期、时间
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        // 25 小时 3 分钟后
        LocalDateTime future = localDateTime.plusHours(25).plusMinutes(3);
        System.out.println(future);

        System.out.println("---- Year YearMonth MonthDay ----");
        // 获取当前年份
        Year year = Year.now();
        System.out.println("当前年份 " + year);
        // 5 年后
        year = year.plusYears(5);
        System.out.println("5 年后 " + year);
        // 指定月份
        YearMonth yearMonth = year.atMonth(10);
        System.out.println("5 年后指定月份 " + yearMonth);
        // 再加 5 年，减 3 个月。
        yearMonth = yearMonth.plusYears(5).minusMonths(3);
        System.out.println("再加 5 年，减 3 个月 " + yearMonth);
        // 当前月日
        MonthDay monthDay1 = MonthDay.now();
        System.out.println("当前月日 " + monthDay1);
        // 设置具体月日
        MonthDay monthDay2 = monthDay1.with(Month.MAY).withDayOfMonth(23);
        System.out.println("指定月日 " + monthDay2);
    }
}