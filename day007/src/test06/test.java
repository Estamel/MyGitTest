package test06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test {
    public static void main(String[] args) throws ParseException {
        Date a = new Date();
        System.out.println(a);
        Date b = new Date(0L);
        System.out.println(b);
        long time = a.getTime();
        a.setTime(time);
        System.out.println(a);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        System.out.println(sdf.format(a));
        String ss = "2048-08-09 11:11:11";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = sdf2.parse(ss);
        System.out.println(parse);

    }
}
