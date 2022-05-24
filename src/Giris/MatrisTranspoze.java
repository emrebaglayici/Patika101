package Giris;

import java.util.Arrays;

public class MatrisTranspoze {
    public static void main(String[] args) {
        int row=2,col=3;
        int[][] arr={
                {2,3,4},
                {5,6,4}
        };

        System.out.println("Matris : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

        int[][] transpose=new int[col][row];
        System.out.println("Transpoze : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i]=arr[i][j];
            }
        }
        for(int[] satir:transpose){
            for(int sut:satir){
                System.out.print(sut+ " ");
            }
            System.out.println();
        }


    }
}
