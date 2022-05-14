package Giris;

import java.util.Scanner;

public class UcDortTamBolunme {
    public static void main(String[] args) {
        int n,sum=0,avg;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Sayı giriniz");
        n=scanner.nextInt();


        int ind=0,k=0;
        while (ind<=n){
            if(ind%3==0 && ind%4==0){
                sum+=ind;
                k++;
            }
            ind++;

        }
        avg=sum/k;
        System.out.println(avg);
    }
}
