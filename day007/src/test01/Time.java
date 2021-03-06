package test01;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Time {
    public static void main(String[] args) throws ParseException {
        String start = "2020年11月11日 0:0:0";
        String end = "2020年11月11日 0:10:0";
        String jia = "2020年11月11日 0:03:47";
        String pi = "2020年11月11日 0:10:11";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        long timeStart = sdf.parse(start).getTime();
        long timeEnd = sdf.parse(end).getTime();
        long timeJia = sdf.parse(jia).getTime();
        long timePi = sdf.parse(pi).getTime();
        if (timeJia > timeStart && timeJia < timeEnd) {
            System.out.println("小贾参加了活动");
        } else {
            System.out.println("小贾没参加上活动");
        }
        if (timePi > timeStart && timePi < timeEnd) {
            System.out.println("小皮参加了活动");
        } else {
            System.out.println("小皮没参加上活动");
        }
    }
}
