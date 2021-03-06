package test04;

public class Test1 {
    public static void main(String[] args) {
        //int[] arr = {1,2,3,4,5};
        int[] arr = null;
        try {
            printArr(arr);
        }catch (Exception e){
            System.out.println(e);
            System.out.println("GGGGGGGGG");
        }
    }

    public static void printArr(int[] arr) {
        if (arr==null) {
            throw new NullPointerException("GG");
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
