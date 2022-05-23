package Giris;

public class MatrisForEach {
    public static void main(String[] args) {
        double[] tekMatrix={1.0,2.2,3.3};
        int[][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}
        };
        for (int[] row:matrix) {
            for(int col:row){
                System.out.print(col+ " ");
            }
            System.out.println();
        }
        for (double k:tekMatrix) {
            System.out.print(k+" ");
        }
    }
}
