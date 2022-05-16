package Giris;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("n1 sayısını giriniz");
        int n1=scanner.nextInt();
        System.out.println("n2 sayısını giriniz");
        int n2=scanner.nextInt();
        int ebob=1,min,i;
        min = Math.min(n1, n2);

        i=min;
        while(i>=1){
            if(n1%i==0 && n2%i==0) {
                ebob = i;
                System.out.println(ebob);
                break;
            }
            i--;
        }

        int k=1;
        while (k<=(n1*n2)){
            if(k%n1==0 && k%n2==0){
                System.out.println(k);
                break;
            }
            k++;
        }

    }
}
