public class Work06 {
    //题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
    //程序分析：利用辗除法。
    public static void main(String[] args){
        int m,n;
            m = Integer.parseInt(args[0]);
            n = Integer.parseInt(args[1]);
        }
    public static void max_min(int m, int n){
        int temp = 1;
        int yshu = 1;
        int bshu = m*n;
        if(n<m){
            temp = n;
            n = m;
            m = temp;
        }
        while(m!=0){
            temp = n%m;
            n = m;
            m = temp;
        }
        yshu = n;
        bshu /= n;
        System.out.println(m+"和"+n+"的最大公约数为"+yshu);
        System.out.println(m+"和"+n+"的最小公倍数为"+bshu);
    }

}
