package Giris;

public class Recursive {
    static int as(int i){
        if(i<2)
            return 1;
        else
            return (i* as(i-1));
    }
    public static void main(String[] args) {
        //recursiveMethod(4);
        System.out.println(as(3));
    }

    /* static void recursiveMethod(int num) {
        num--;
        if (num == 0)
            return;
        System.out.print(num + ",");
        recursiveMethod(num);
    }
     */
}
