package Boks;

public class Match {
    Fighter f1,f2;
    int minWeight;
    int maxWeight;

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run(){
        if(checkWeight()){
            while (f1.health>0 && f2.health>0){
                System.out.println("New Raund");
                double random=Math.random()*100;
                if(random>=0 && random<=50){
                    System.out.println(f1.name+" maça başladı");
                    f2.health=f1.hit(f2);
                    if(isWin()){
                        break;
                    }
                    f1.health=f2.hit(f1);
                }
                if(random>50 && random<=100){
                    System.out.println(f2.name+" maça başladı");
                    f1.health=f2.hit(f1);
                    if(isWin()){
                        break;
                    }
                    f2.health=f1.hit(f2);
                    printScore();
                }
            }
        }else
            System.out.println("Ağırlıklar uyuşmuyor.");

    }

    void printScore() {
        System.out.println("------------");
        System.out.println(f1.name+" kalan can "+f1.health);
        System.out.println(f2.name+ "kalan can "+f2.health);
    }

    boolean isWin() {
        if(f1.health==0){
            System.out.println("Maçı kazanan "+ f2.name);
            return true;
        } else if (f2.health==0) {
            System.out.println("Maçı kazanan "+f1.name);
            return true;
        }
        return false;
    }

    boolean checkWeight() {
        return (f1.weight>=minWeight && f1.weight<=maxWeight) && (f2.weight>=minWeight && f2.weight<=maxWeight);
    }
}
