package Giris;

import java.text.DecimalFormat;
import java.util.Scanner;

public class KDV {
    private static final DecimalFormat df=new DecimalFormat("0.0");
    public static void main(String[] args) {
        double total = 0,cost, kdv=0.18, wkdv;
        Scanner scanner=new Scanner(System.in);
        cost=scanner.nextDouble();
        total=cost+(cost*kdv);
        wkdv=total-cost;
        if(cost>=0 &&cost<=1000){
            System.out.println("Kdv siz fiyat"+cost+"\nKdv li Fiyat "+(cost+(cost*0.18))+" \nKdv tutarı "+df.format(wkdv));
        }else {
            System.out.println("Kdv siz fiyat"+cost+
                    "\nKdv li Fiyat "+(cost+(cost*0.08))+
                    " \nKdv tutarı "+df.format((cost+(cost*0.08)-cost)));
        }


    }
}
