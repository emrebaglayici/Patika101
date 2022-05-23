package Giris;

import java.util.Arrays;

public class ArraysUtil {
    public static void main(String[] args) {

        int[] arr={90,1,100,-2,80,-18};
//        HelperArray.print(arr);
//        HelperArray.fill(arr,10);
//        HelperArray.sort(arr);
        System.out.println(Arrays.toString(HelperArray.copyArr(arr, 6)));
        System.out.println(Arrays.toString(HelperArray.copyArrWithRange(arr, 0,4)));
        HelperArray.toStr(arr);

        //        System.out.println(HelperArray.binarySh(arr,-18));
//        Arrays.fill(arr,10);
//        Arrays.fill(arr,2,6,25);
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
    }
}
