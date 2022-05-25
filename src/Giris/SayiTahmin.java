package Giris;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int number= random.nextInt(100);
        boolean isWrong=false,isWin=false;
        int right=0,guess;
        int[] wrongGuesses=new int[5];
        showNumber(number);
        while(right<5){

            System.out.print("Tahmininizi giriniz : ");
            guess=scanner.nextInt();
            if(guess<0 || guess>99){
                System.out.println("Lütfen 0 ile 100 arasında bir değer giriniz");
                if(isWrong){
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız kalan hak : "+(5-right) );
                }else{
                    isWrong=true;
                    System.out.println("Bir dahaki hatalı girişinizde hakkınızdan düşülecektir");
                }
                continue;
            }

            if(guess==number){
                System.out.println("Tebrikler , doğru bildiniz. Random üretilen sayı : "+number);
                isWin=true;
                break;
            }else{
                System.out.println("Hatalı bir sayı giriniz !");
                if(guess<number){
                    System.out.println("Girilen "+guess+" sayısı random üretilen sayıdan küçüktür");

                }else{
                    System.out.println("Girilen "+guess+" sayısı random üretilen sayıdan büyüktür");
                }
                wrongGuesses[right++]=guess;
                showRight(right);
            }


        }

        if(!isWin){
            System.out.println("Kaybettiniz");
            if(!isWrong){
                System.out.println("Tahminleriniz :"+ Arrays.toString(wrongGuesses));
            }
        }
    }
    static void showRight(int right){
        System.out.println("Kalan hakkınız : "+ (5-right));
    }
    static void showNumber(int number){
        System.out.println("Random üretilen sayı : "+number);
    }

}
