package Giris;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        String str;
        int total = 0;
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        for (int i = 1; i < n; i++) {
            if(n%i==0)
                total+=i;
        }
        if(total==n)
            str=n+" Mükemmel sayıdır";
        else
            str=n+" Mükemmel sayı değildir";

        System.out.println(str);
    }
}
