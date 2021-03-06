package test3;

public class test {
    public static void main(String[] args) {
        String s = "91 27 46 38 50";
        String[] s1 = s.split(" ");
        int[] i = new int[s1.length];
        for (int i1 = 0; i1 < i.length; i1++) {
            i[i1] = Integer.parseInt(s1[i1]);
        }
        for (int i1 = 0; i1 < i.length; i1++) {
            System.out.println(i[i1]);
        }
    }
}
