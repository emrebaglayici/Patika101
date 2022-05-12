package Giris;

import java.util.Scanner;

public class AlanUcgen {
    public static void main(String[] args) {
        int a,b,c;
        double u,Alan;
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        u=(a+b+c)/2;
        Alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println(Alan);
    }
}
