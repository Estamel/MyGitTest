package test08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class test {
    public static void main(String[] args) throws ParseException {
        String s ="1999-01-01 10:10:10";
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date a = new Date();
        System.out.println(sf.parse(s));
        System.out.println(a);
        System.out.println(sf.format(a));
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.format(pattern));
        LocalDateTime parse = LocalDateTime.parse(s, pattern);
        System.out.println(parse);
    }
}
