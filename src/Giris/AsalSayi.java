package Giris;

public class AsalSayi {
    public static void main(String[] args) {
        int n=100;
        int counter;
        for (int i = 1; i <=n ; i++) {
            counter=0;
            for (int j = i; j >=1 ; j--) {
                if(i%j==0)
                    counter+=1;
            }
            if(counter==2)
                System.out.println(i);
        }



    }
}
