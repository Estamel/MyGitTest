package test2;

import java.math.BigDecimal;

public class test {
    public static void main(String[] args) {
        BigDecimal big = new BigDecimal("0.3");
        BigDecimal big2 = new BigDecimal("0.11");
        BigDecimal big3 = big.divide(big2, 9, BigDecimal.ROUND_HALF_UP);
        BigDecimal big4 = big.divide(big2, 9, BigDecimal.ROUND_UP);
        BigDecimal big5 = big.divide(big2, 9, BigDecimal.ROUND_DOWN);
        System.out.println(big3);
        System.out.println(big4);
        System.out.println(big5);
    }
}
