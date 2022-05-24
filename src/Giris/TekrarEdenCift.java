package Giris;

public class TekrarEdenCift {
    public static void main(String[] args) {
        int[] arr={3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1,2,66,66};
        int[] duplicate=new int[arr.length];
        int startIndex=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if((i!=j)&&(arr[i]==arr[j])){
                    if(!isFind(duplicate,arr[i])){
                        duplicate[startIndex++]=arr[i];
                    }
                    break;
                }
            }
        }
        for (int value:
             duplicate) {
            if(value!=0 && value%2==0)
                System.out.println(value);
        }

    }

    static boolean isFind(int[] duplicate, int value) {
            for(int i:duplicate){
                if(i==value)
                    return true;
            }
            return false;
    }
}
