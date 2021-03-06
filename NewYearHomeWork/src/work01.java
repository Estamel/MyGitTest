public class work01 {
    //题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少？
    //1 1 2 3 5 8 13 21
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int m = 1;
        System.out.println(a);
        System.out.println(b);
        while (m<10) {
            int c = a+b;
            System.out.println(c);
            if (m%2==1) {
                a = c;
                m++;
            }else {
                b = c;
                m++;
            }
        }
    }
}
