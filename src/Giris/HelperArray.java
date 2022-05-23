package Giris;

public class HelperArray {
    static void print(int[] arr){
        for (int i:arr)
            System.out.print(i+" ");
    }

    static void fill(int[] arr,int value){
        for (int i = 0; i < arr.length; i++) {
                arr[i]=value;
        }
    }
    static int[] sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                int temp;
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    static int binarySh(int[] arr,int value){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==value){
                return i;
            }
        }
        return -1;
    }

    static int[] copyArr(int[] arr,int length){
        int[] newArr=new int[length];
        for (int i = 0; i < length; i++) {
            newArr[i]=arr[i];
        }
        return newArr;
    }


    static int[] copyArrWithRange(int[] arr, int from, int to) {
        int[] newArr=new int[to-from];
        for (int i = 0; i < to-from; i++) {
            newArr[i]=arr[i];
        }
        return newArr;
    }
    static void toStr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
