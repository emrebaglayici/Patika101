package Giris;

import java.util.Scanner;

public class BasamakSayisi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Sayı giriniz");
        int digitCounter = 0;
        int number=scanner.nextInt();
        int tempNumber=number;
        int result = 0;
        int value;


        while (tempNumber!=0){
            tempNumber/=10;
            digitCounter++;
        }

        tempNumber=number;

        while (tempNumber!=0){
            value=tempNumber%10;
            result+=value;
            tempNumber/=10;
        }
        System.out.println(result);


    }
}
