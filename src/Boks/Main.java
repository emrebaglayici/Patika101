package Boks;

public class Main {
    public static void main(String[] args) {
        Fighter f1=new Fighter("Emre",15,100,80,60);
        Fighter f2=new Fighter("Elif",20,75,60,40);
        Match match=new Match(f1,f2,60,80);
        match.run();
    }
}
