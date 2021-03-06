package test02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        long time1 = sdf.parse(s).getTime();
        long time2 = new Date().getTime();
        long time = time2-time1;
        long age = time/1000/60/60/24;
        System.out.println(age);
    }
}
