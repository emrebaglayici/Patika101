package Giris;

import java.util.Scanner;

public class Etkinlik {
    public static void main(String[] args) {
        int heat;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Sıcaklık giriniz");
        heat=scanner.nextInt();

        if(heat<5)
            System.out.println("kayak Yapabilirsin");
        else if (heat<=25) {
            if(heat<=15)
                System.out.println("Sinema");
            if (heat>=10) {
                System.out.println("Piknik");
            }
        }
        else {
            System.out.println("Yüzme");
        }
    }
}
