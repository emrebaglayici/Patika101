package Giris;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int x,y,selection;
        Scanner scanner=new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz");
        x=scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz");
        y=scanner.nextInt();
        System.out.println("1 - Toplama \n2 - Çıkarma\n3 - Çarpma\n4 - Bölme");
        selection=scanner.nextInt();

        switch (selection){
            case 1:
                System.out.println("Sonuç "+(x+y));
                break;
            case 2:
                System.out.println("Sonuç "+(x-y));
                break;
            case 3:
                System.out.println("Sonuç "+(x*y));
                break;
            case 4:
                if(y!=0){
                    System.out.println("Sonuç "+(x/y));
                    break;
                }else{
                    System.out.println("Bir sayı sıfıra bölünemez");
                    break;
                }
            default:
                System.out.println("Yanlış bir seçim giriniz");
        }

    }
}
