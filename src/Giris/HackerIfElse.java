package Giris;

import java.util.Scanner;

public class HackerIfElse {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String result = "";
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        if(N%2==1)
            result="Weird";
        if ((N%2==0))
            if((N>=2 && N<=5))
                 result="Not Weird";
        if ((N%2==0)&&(N>=6 && N<=20))
            result="Weird";
        if ((N%2==0)&&(N>20)) {
            result="Not Weird";
        }

        System.out.println(result);
    }
}
