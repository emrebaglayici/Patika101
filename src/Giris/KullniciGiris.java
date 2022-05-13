package Giris;

import java.util.Scanner;

public class KullniciGiris {
    public static void main(String[] args) {
        String userName,password,newPassword;
        int selection;

        Scanner scanner=new Scanner(System.in);
        System.out.print("Username = ");
        userName=scanner.nextLine();
        System.out.print("Password = ");
        password=scanner.nextLine();

        if(userName.equals("emre")&&password.equals("123")){
            System.out.println("Giriş yaptınız");
        } else if (!password.equals("123")) {
            System.out.println("Şifreniz yanlış! Şifrenizi sıfırlamak ister misiniz, Evet ise 1 e basın");
            selection=scanner.nextInt();
            if (selection == 1) {
                System.out.println("Yeni şifre giriniz");
                newPassword = scanner.next();
                if (!newPassword.equals("123")) {
                    System.out.println("Şifre oluşturuldu ve Giriş yaptınız");
                } else {
                    System.out.println("Şifre oluşturulamadı");
                }
            } else {
                System.out.println("Yanlış seçim giriniz");
            }
        } else{
            System.out.println("Bilgileriniz yanlış");
        }
    }
}
