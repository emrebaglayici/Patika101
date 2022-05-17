package Giris;

public class BasamakSayisiRec {
    static int basamakSayisi(int sayi){
        if(sayi==0)
            return 0;
        else
            return sayi%10 + basamakSayisi(sayi/10);
    }
    public static void main(String[] args) {
        System.out.println(basamakSayisi(45612));
    }
}
