package Giris;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int min=0,max=0;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz : ");
        int selection=scanner.nextInt();
        for (int i = 1; i <=selection ; i++) {
            System.out.print(i+" . sayıyı giriniz : ");
            int value=scanner.nextInt();

            if(value<min)
                min=value;
            if(value>min)
                max=value;
        }
        System.out.println(max);
        System.out.println(min);


    }
}
