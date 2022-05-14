package Giris;

import java.util.Scanner;

public class CiftDort {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.print("Sayı giriniz");
            n=scanner.nextInt();
            if(n % 4 == 0)
                sum+=n;

        }while (n%2==0);
        System.out.println(sum);
    }
}
