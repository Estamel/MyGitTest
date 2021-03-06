package test07;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;

public class test {
    public static void main(String[] args) throws ParseException {
        String s = "1999-01-05 11:11:11";
        Date a = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(format.format(a));
        System.out.println(format.parse(s));
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime parse = LocalDateTime.parse(s, pattern);
        System.out.println(parse);
        System.out.println(pattern.format(now));
        System.out.println(now.format(pattern));
        LocalDate now1 = LocalDate.now();
        DateTimeFormatter pattern1 = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        System.out.println(now1.format(pattern1));
        System.out.println(Period.between(parse.toLocalDate(), LocalDateTime.now().toLocalDate()));
        System.out.println(Duration.between(parse, LocalDateTime.now()).toNanos());
        int[] arr = {9,5,2,8,6};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
