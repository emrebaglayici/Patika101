package Giris;

import java.util.Scanner;

public class Ucgen {
    public static void main(String[] args) {
        double a,b,c;
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=Math.pow(a,2)+Math.pow(b,2);
        System.out.println(Math.sqrt(c));
    }
}
