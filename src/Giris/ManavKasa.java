package Giris;

import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double unitArmut=2.14,
                unitElma=3.67,
                unitDomates=1.11,
                unitMuz=0.95,
                unitPatlican=5.0,
                total;

        Scanner scanner=new Scanner(System.in);
        System.out.println("armut kaç kilo ?");
        unitArmut*=scanner.nextDouble();
        System.out.println("elma kaç kilo ?");
        unitElma*=scanner.nextDouble();
        System.out.println("domates kaç kilo ?");
        unitDomates*=scanner.nextDouble();
        System.out.println("muz kaç kilo ?");
        unitMuz*=scanner.nextDouble();
        System.out.println("patlican kaç kilo ?");
        unitPatlican*=scanner.nextDouble();
        total=unitArmut+unitElma+unitDomates+unitMuz+unitPatlican;
        System.out.println("Toplam tutar ? "+total);

    }
}
