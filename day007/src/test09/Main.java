package test09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        num a0 = new num(0);
        num a1 = new num(1);
        num a2 = new num(2);
        num a3 = new num(3);
        num a4 = new num(4);
        num a5 = new num(5);
        num a6 = new num(6);
        num a7 = new num(7);
        num a8 = new num(8);
        num a9 = new num(9);
        String[] s = b.split(" ");
        for (int i = 0; i < s.length; i++) {
            int integer = Integer.parseInt(s[i]);
            if (integer==0) {
                a0.inNum++;
            }if (integer==1) {
                a1.inNum++;
            }if (integer==2) {
                a2.inNum++;
            }if (integer==3) {
                a3.inNum++;
            }if (integer==4) {
                a4.inNum++;
            }if (integer==5) {
                a5.inNum++;
            }if (integer==6) {
                a6.inNum++;
            }if (integer==7) {
                a7.inNum++;
            }if (integer==8) {
                a8.inNum++;
            }if (integer==9) {
                a9.inNum++;
            }
        }
        num[] arr = {a0,a1,a2,a3,a4,a5,a6,a7,a8,a9};
        int flag = arr.length-1;
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].getInNum() > arr[j + 1].getInNum()) {
                    num temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = arr.length-1; i >0; i--) {
            if (arr[i].getInNum()==arr[i-1].getInNum()) {
                flag--;
            }else {
                System.out.println(arr[flag].getoNum());
                System.exit(0);
            }
        }
    }
}
class num{
    int inNum = 0;
    int oNum = 0;
    num(int a ){
        oNum = a;
    }

    public int getInNum() {
        return inNum;
    }

    public int getoNum() {
        return oNum;
    }
}