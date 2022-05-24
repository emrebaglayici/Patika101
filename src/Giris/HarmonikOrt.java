package Giris;

public class HarmonikOrt {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        double formula,sum=0.0;
        for (int i = 0; i < arr.length; i++) {
            sum+=1.0/(arr[i]);
        }
        formula=arr.length/sum;
        System.out.println(formula);
    }
}
