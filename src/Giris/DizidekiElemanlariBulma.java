package Giris;

import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanlariBulma {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz : ");
        int N=scanner.nextInt();
        int[] arr=new int[N];
        int sayi;
        System.out.println("Dizinin elemanlarını giriniz");
        for (int i = 0; i <N ; i++) {
            System.out.print((i+1)+ ". Elemanı giriniz :");
            sayi=scanner.nextInt();
            arr[i]=sayi;
        }
        sort(arr);

        for(int a:arr){
            System.out.print(a+ " ");
        }
    }
    static int[] sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int temp;
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

}
