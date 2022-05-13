package Giris;

import java.util.Scanner;

public class SınıfGecme {
    public static void main(String[] args) {
        int mat,fzk,tr,kim,mzk;
        double ort;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Matematik notunuz : ");
        mat=scanner.nextInt();

        System.out.print("Fizik notunuz : ");
        fzk=scanner.nextInt();

        System.out.print("Türkçe notunuz : ");
        tr=scanner.nextInt();

        System.out.print("Kimya notunuz : ");
        kim=scanner.nextInt();

        System.out.print("Müzik notunuz : ");
        mzk=scanner.nextInt();

        ort=(mat+fzk+tr+kim+mzk)/5;

        if(!(ort<0 || ort>100)){
            if(ort<55){
                System.out.println("Kaldınız");
            }else{
                System.out.println("Geçtiniz");
            }
            System.out.println("Ortalamanız "+ ort);
        }else{
            System.out.println("geçersiz ortalama "+ort);
        }


    }
}
