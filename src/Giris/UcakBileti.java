package Giris;

import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        double km,kmPrice=0.1,totalCost;
        int age,selection;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Mesafeyi km türünden giriniz : ");
        km=scanner.nextDouble();

        System.out.println("Yaşınızı giriniz : ");
        age=scanner.nextInt();

        System.out.println("1 => Tek Yön , 2 => Gidiş Dönüş");
        selection=scanner.nextInt();

        totalCost=km*kmPrice;

        if(km>0 && age>0) {
            if (selection == 1 || selection == 2) {
                if (age < 12) {
                    totalCost = totalCost / 2;
                    if (selection == 2) {
                        totalCost -= (totalCost * 0.2);
                        totalCost *= 2;
                    }
                } else if (age <= 24) {
                    totalCost -= (totalCost * 0.1);
                    if(selection==2) {
                        totalCost -= (totalCost * 0.2);
                        totalCost *= 2;
                    }
                    System.out.println(totalCost);
                } else if (age > 65) {
                    totalCost -= (totalCost * 0.3);
                    if(selection==2){
                        totalCost-=(totalCost*0.2);
                        totalCost*=2;
                    }
                    System.out.println(totalCost);
                }else {
                    System.out.println(totalCost);
                }

            } else {
                System.out.println("Hatalı veri girdiniz");
            }
        }else {
            System.out.println("Yaş ve km 0 dan küçük olamaz");
        }
    }
}
