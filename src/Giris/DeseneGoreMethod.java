package Giris;

import java.util.Scanner;

public class DeseneGoreMethod {
    static void methd(int n){
       /* if(n==0 || n<0) {
            methd(n+5);
            System.out.print(n+ " ");

        }else{
            System.out.print(n+ " ");
            methd(n-5);
            System.out.print(n+ " ");
        }
        */
        int temp=n;
        while (n>0){
            System.out.print(n+ " ");
            n-=5;
            if(n<=0){
                for (int i = n; i <=temp ; i=i+5) {
                    System.out.print(i+ " ");
                }
            }
        }


    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        methd(n);
    }
}
