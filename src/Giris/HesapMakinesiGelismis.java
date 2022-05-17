package Giris;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HesapMakinesiGelismis {
    private static final DecimalFormat decimalFormat=new DecimalFormat("0.00");
    private static final Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        int select;
        String menu=" 0 - Çıkış\n" +
                " 1 - Toplama İşlemi\n "+
                "2 - Çıkarma İşlemi\n"+
                " 3 - Çarpma İşlemi\n"+
                " 4 - Bölme İşlemi\n"+
                " 5 - Üslü Sayı Hesaplama\n"+
                " 6 - Faktöriyel Hesaplama\n"+
                " 7 - Mod Alma\n"+
                " 8 - Dikdörtegen Alan ve Çevre Hesabı";

        System.out.println(menu);
        do{
            System.out.print("Lütfen bir işlem seçiniz :");
            select=scanner.nextInt();
            switch (select){
                case 0:
                    System.out.println("Çıkış yaptınız");
                    break;
                case 1:
                    System.out.println(sum());
                    break;
                case 2:
                    System.out.println(minus());
                    break;
                case 3:
                    System.out.println(multiply());
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    System.out.println(pow());
                    break;
                case 6:
                    System.out.println(factorial());
                    break;
                case 7:
                    System.out.println(mod());
                case 8:
                    square();
                default:
                    System.out.println("Geçersiz tuşlama yaptınız.");
            }
        }
        while (select!=0);

    }

    static void square() {
        System.out.print("a kenarı :");
        int a=scanner.nextInt();
        System.out.print("b kenarı :");
        int b=scanner.nextInt();
        int alan=a*b, cevre=2*(a*b);
        System.out.println("Dikdörtgenin alanı :" +alan);
        System.out.println("Dikdörtgenin çevresi :" +cevre);
    }

    static int mod() {
        System.out.print("İlk sayı :");
        int a=scanner.nextInt();
        System.out.print("İkinci sayı :");
        int b=scanner.nextInt();
        return a%b;

    }

    static int factorial() {
        System.out.println("Sayıyı giriniz ");
        int x=scanner.nextInt();
        int result=1;
        for (int i = 1; i <=x ; i++) {
            result*=i;
        }
        return result;
    }

    static int pow() {
        System.out.print("Taban sayısı :");
        int a=scanner.nextInt();
        System.out.print("üst sayısı :");
        int b=scanner.nextInt();
        int result = 1;
        for (int i = 1; i <=b ; i++) {
            result*=a;
        }
        return result;
    }

    static void divide() {
        System.out.print("Bölünen sayı :");
        double a=scanner.nextInt();
        System.out.print("Bölen sayı :");
        double b=scanner.nextInt();
        double result=0.0;
        result=a/b;
        if(b!=0) {
            System.out.println(decimalFormat.format(result));
        }
        else
            throw new IllegalArgumentException("Sıfıra bölünemez");

    }

    static int multiply() {
        System.out.print("İlk sayı :");
        int a=scanner.nextInt();
        System.out.print("İkinci sayı :");
        int b=scanner.nextInt();
        return a*b;
    }

    static int minus() {
        System.out.print("İlk sayı :");
        int a=scanner.nextInt();
        System.out.print("İkinci sayı :");
        int b=scanner.nextInt();
        return a-b;
    }

    static int sum() {
        System.out.print("İlk sayı :");
        int a=scanner.nextInt();
        System.out.print("İkinci sayı :");
        int b=scanner.nextInt();
        return a+b;
    }
}
