package Giris;

import java.util.Scanner;

public class Bankamatik {
    public static void main(String[] args) {
        String userName,password;
        int remainRight=3;
        int selection;
        int balance=1500;
        int price;
        Scanner scanner=new Scanner(System.in);


        while (remainRight>0) {
            System.out.println("Kullanıcı adınızı giriniz");
            userName=scanner.nextLine();
            System.out.println("Şifrenizi giriniz");
            password=scanner.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Bankamıza hoşgeldiniz");
                do {
                    System.out.print("1 - Para Yatırma\n" +
                            "2 - Para Çekme\n" +
                            "3 - Bakiye Sorgulama\n" +
                            "4 - Çıkış Yap\n");
                    System.out.print("Seçiminiz : ");
                    selection = scanner.nextInt();
                    switch (selection) {
                        case 1:
                            System.out.print("Para Miktarı :");
                            price = scanner.nextInt();
                            balance += price;
                            System.out.println(price+" ₺ yatırıldı , yeni bakiye "+balance);
                            break;
                        case 2:
                            System.out.print("Para Miktarı :");
                            price = scanner.nextInt();
                            if (price>balance)
                                System.out.println("Bakiyeniz yeterli değildir");
                            else
                                balance -= price;
                                System.out.println(price+" ₺ çekildi , yeni bakiye "+balance);
                                break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                    }
                } while (selection != 4);
                System.out.println("Görüşmek Üzere");
                break;
            } else {
                remainRight--;
                System.out.println("Hatalı giriş yaptınız");
                if (remainRight == 0)
                    System.out.println("hesabınız bloke olmuştur");
                else
                    System.out.println("Kalan hakkınız " + remainRight);

            }
        }


    }
}
