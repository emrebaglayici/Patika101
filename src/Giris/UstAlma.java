package Giris;

import java.util.Scanner;

public class UstAlma {
    public static void main(String[] args) {
        int n,k;
        int total=1;
        Scanner scanner=new Scanner(System.in);

        n=scanner.nextInt();
        k=scanner.nextInt();

        for (int i = 1; i <=k ; i++) {
            total*=n;
        }
        System.out.println(total);
    }
}
