package Giris;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=scanner.nextInt();
        int tempNumber=number;
        int digitCounter = 0;
        int value;
        int basePowder;
        int result=0;

        while(tempNumber!=0){
            tempNumber/=10;
            digitCounter++;
        }

        tempNumber=number;
        while (tempNumber!=0){
            value=tempNumber%10;
            basePowder=1;
            for (int i = 1; i <=digitCounter ; i++) {
                basePowder*=value;
            }
            result+=basePowder;
            tempNumber/=10;
        }
        if(result==number)
            System.out.println("Bu bir armstrong sayıdır "+result);
        else
            System.out.println("Bu bir armstrong sayısı değildir "+result);
    }
}
