package Giris;

public class ArrayOrtalama {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        double sum=0.0,avg=0.0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        avg=sum/arr.length;
        System.out.println(avg);
    }
}
