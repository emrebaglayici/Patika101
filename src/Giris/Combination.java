package Giris;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        int n,r,formula=0,fak = 1,rfak=1,nrFak=1;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Faktöriyel giriniz");
        n=scanner.nextInt();
        System.out.println("R giriniz");
        r=scanner.nextInt();

        for (int i = 1 ; i <=n ; i++) {
            fak*=i;
        }
        for (int i = 1; i <=r ; i++) {
            rfak*=i;
        }
        for (int i = 1; i <=n-r ; i++) {
            nrFak*=i;
        }
        formula=fak/(rfak*nrFak);
        System.out.println(formula);

    }
}
