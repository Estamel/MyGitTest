package test03;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        LocalDate now = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate parse = LocalDate.parse(s, dateTimeFormatter);
        LocalDateTime localDateTime = parse.atStartOfDay();
        LocalDateTime localDateTime1 = now.atStartOfDay();
        Duration duration = Duration.between(localDateTime, localDateTime1);
        System.out.println(duration.toDays());
    }
}
