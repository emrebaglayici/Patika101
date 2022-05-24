package Giris;

import java.util.Arrays;
import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println("N i girin");
        int counter=0,sayi;
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int sum=0;
            for (int j = i; j <n ; j++) {
                sum=arr[j]+sum;
                if(sum<0)
                    counter++;
            }
        }
        System.out.println(counter);
    }
}
