package Giris;

import java.util.Scanner;

public class BasamakSayisi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Sayı giriniz");
        int number= scanner.nextInt();
        int result = 0;
        int value;

        while (number!=0){
            value=number%10;
            result+=value;
            number/=10;
        }
        System.out.println(result);


    }
}
