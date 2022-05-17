package Giris;


import java.util.Scanner;

public class AsalSayiR {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int n=scanner.nextInt();
        primeNumber(n);
    }

    static void primeNumber(int n) {
        int counter;
        for (int i = 1; i <=n ; i++) {
            counter=0;
            for (int j = i; j >=1 ; j--) {
                if(i%j==0)
                    counter+=1;
            }
            if(counter==2)
                System.out.println(i);
        }

    }

}
