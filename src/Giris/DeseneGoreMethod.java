package Giris;

import java.util.Scanner;

public class DeseneGoreMethod {
    static void methd(int n){
        if(n==0 || n<0) {
            n += 5;
            System.out.println(n);
        }
        else {
            methd(n-5);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        methd(n);
    }
}
