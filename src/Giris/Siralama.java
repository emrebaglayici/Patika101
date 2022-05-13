package Giris;

import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {
        int x,y,z;
        Scanner scanner=new Scanner(System.in);
        System.out.println("1. sayı : ");
        x=scanner.nextInt();
        System.out.println("2. sayı : ");
        y= scanner.nextInt();
        System.out.println("3. sayı : ");
        z=scanner.nextInt();

        if((x<y)&&(x<z))
            if (y<z)
                System.out.println("x<y<z");
            else
                System.out.println("x<z<y");
        if((y<x)&&(y<z))
            if(x<z)
                System.out.println("y<x<z");
            else
                System.out.println("y<z<x");
        else
            if(x<y)
                System.out.println("z<x<y");
            else
                System.out.println("z<y<x");

    }
}
