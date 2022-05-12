package Giris;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Taksimetre {
    private static final DecimalFormat decimalFormat=new DecimalFormat("0.0");
    public static void main(String[] args) {
        double unitMeter=2.20,totalCost,minCost=20.0,openingCost=10,km;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Total Km ?");
        km=scanner.nextDouble();
        totalCost=openingCost+(km*unitMeter);
        if(totalCost<20){
            System.out.println("Ödenecek Tutar "+minCost);
        }else{
            System.out.println("Ödenecek Tutar "+decimalFormat.format(totalCost));
        }

    }
}
