package Giris;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int date;
        String str;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Yıl Giriniz");
        date = scanner.nextInt();

        if (date % 4 == 0) {
            if (date % 100 == 0) {
                if (date % 400 == 0) {
                    str = date + " artık yıldır";
                } else {
                    str = date + " artık yıl değildir";

                }
            }else{
                str = date + " artık yıldır";
            }
        }else{
            str = date + " artık yıl değildir";
        }
        System.out.println(str);
    }
}