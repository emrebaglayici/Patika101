package Giris;
import java.util.Scanner;
public class Baslangic {
    public static void main(String[] args) {
        int mat,fzk,kim,tr,trh,mzk;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Matematik Notunu Giriniz");
        mat=scanner.nextInt();

        System.out.println("Fizik Notunu Giriniz");
        fzk=scanner.nextInt();

        System.out.println("Kimya Notunu Giriniz");
        kim=scanner.nextInt();

        System.out.println("Türkçe Notunu Giriniz");
        tr=scanner.nextInt();

        System.out.println("Tarih Notunu Giriniz");
        trh=scanner.nextInt();

        System.out.println("Müzik Notunu Giriniz");
        mzk=scanner.nextInt();

        int sum=(mat+fzk+kim+tr+trh+mzk);
        double result=sum/6;
        System.out.println(result);
        String str= (result>60)? "Geçtiniz" : "Kaldınız";
        System.out.println(str);
    }
}
