package Giris;

import java.util.Scanner;

public class Exp {
    private static final Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(exp());
    }

    static int exp() {
        System.out.print("Taban sayısı : ");
        int a=scanner.nextInt();
        System.out.print("Üs sayısı : ");
        int b=scanner.nextInt();
        int result=1;
        for (int i = 1; i <=b ; i++) {
            result*=a;
        }
        return result;
    }
}
