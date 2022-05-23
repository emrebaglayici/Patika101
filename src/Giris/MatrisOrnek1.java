package Giris;

import java.util.Scanner;

public class MatrisOrnek1 {
    public static void main(String[] args) {
        int[][] matris=new int[3][4];
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter "+matris.length + "rows and "+matris[0].length+ " columns: ");
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                matris[i][j]=scanner.nextInt();
            }
        }
    }
}
