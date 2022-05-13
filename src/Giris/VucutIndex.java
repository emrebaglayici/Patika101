package Giris;

import java.util.Scanner;

public class VucutIndex {
    public static void main(String[] args) {
        double boy,kilo,ind;

        Scanner scanner=new Scanner(System.in);
        System.out.println("boyunuzu giriniz");
        boy=scanner.nextDouble();
        System.out.println("kilonuzu giriniz");

        kilo=scanner.nextDouble();

        ind=kilo/(boy*boy);
        System.out.println("Vücut Kitle endeksiniz "+ind);


    }
}
