package Giris;

import java.util.Scanner;

public class KuvvetBulma {
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        for (int i = 1; i <=n ; i*=4) {
            for (int j = 1 ; j <i ; j*=5) {
                System.out.println(j);
            }
        System.out.println(i);
        }
    }
}
