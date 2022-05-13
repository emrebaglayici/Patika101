package Giris;

import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args) {
        double pi=3.14;
        int r;
        System.out.println("Yarı çap giriniz");
        Scanner scanner=new Scanner(System.in);
        r=scanner.nextInt();

        double alan=pi*r*r;
        double formula=(pi*(r*r)*alan)/360;
        System.out.println("Dairenin dilimi "+formula);

    }
}
