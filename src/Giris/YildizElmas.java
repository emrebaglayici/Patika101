package Giris;

public class YildizElmas {
    public static void main(String[] args) {
        int n=5;
        int number=4;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=(n-i) ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=(2*i)-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        for (int i = 1; i <=number ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <=2*i-1 ; k++) {
//                System.out.println("*");
//            }
//
//            System.out.println();
//        }

        for (int i = number; i >=1 ; i--) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
