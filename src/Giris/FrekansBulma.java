package Giris;

import java.util.Arrays;

public class FrekansBulma {
    public static void main(String[] args) {
        int[] arr={10, 20, 20, 10, 10, 20, 5, 20};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Tekrar Sayıları");

        for (int i = 0; i < arr.length; i++) {
            int ind=0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    ind++;
                }
            }
            System.out.println(arr[i]+ " "+ind+" tekrar etti");
            i=i+(ind-1);


        }
    }
}
