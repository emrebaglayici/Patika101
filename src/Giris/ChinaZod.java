package Giris;

import java.util.Scanner;

public class ChinaZod {
    public static void main(String[] args) {
        int date,divide;
        String str="";


        Scanner scanner=new Scanner(System.in);
        System.out.println("Doğum yılınızı giriniz");
        date=scanner.nextInt();
        divide=(date%12);

        switch (divide){
            case 0:
                str="Maymun";
                break;
            case 1:
                str="Horoz";
                break;
            case 2:
                str="Köpek";
                break;
            case 3:
                str="Domuz";
                break;
            case 4:
                str="Fare";
                break;
            case 5:
                str="Öküz";
                break;
            case 6:
                str="Kaplan";
                break;
            case 7:
                str="Tavşan";
                break;
            case 8:
                str="Ejderha";
                break;
            case 9:
                str="Yılan";
                break;
            case 10:
                str="At";
                break;
            case 11:
                str="Koyun";
                break;

        }
        System.out.println(str);
    }
}
