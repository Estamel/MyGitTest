import java.util.Scanner;

public class Work05 {
    //题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
    //程序分析：(a>b)?a:b这是条件运算符的基本例子。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String score = null;
        String str = (n>=90)?"A":((n>60)?"B":"C");
        System.out.println(n+str);
    }
}
