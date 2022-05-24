package Giris;

import java.util.Arrays;
import java.util.Scanner;

public class EnYakinSayi {
    public static void main(String[] args) {
        int closeMin = 0, closeMax = 0;
        int[] arr = {-6,-3,5,235,78,4,1,7,9,456,23,7,78,2,234,-467,-35,-234};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi gir:");
        int input = scanner.nextInt();

        Arrays.sort(arr);

        if(input<=arr[0])
            System.out.println("Closest Max = "+arr[0]+
                    "\n There is no min closest number.");

        else if(input>=arr[arr.length-1])
            System.out.println("There is no max closest number." +
                    "\nClosest Min = "+arr[arr.length-1]);

        else
        {
            for (int i=0;i<arr.length-2;i++)
            {
                if(input>arr[i])
                {
                    closeMin = arr[i];
                    closeMax = arr[i+1];
                }
            }
            System.out.println("Closest Max = "
                    +closeMax+"\n Closest Min = "
                    +closeMin);
        }

    }
}
