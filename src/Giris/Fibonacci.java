package Giris;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int a=0,b=1,c;
        System.out.print("0 "+ "1");
        for (int i = 2; i < N; i++) {
            c=a+b; //0+1=1  //c=1+1=2   //c=1+2=3   //c=2+3=5
            a=b;    //a=1   //a=1       //a=2
            b=c;    // b= 1 //b=2       //b=3
            System.out.print(" "+c);
        }
    }
}
