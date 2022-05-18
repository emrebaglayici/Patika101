package OgrenciNotSistemi;

public class Student {
    String name;
    int stuNo;
    int year;
    Course c1,c2,c3;
    double avg;
    boolean isPass;

    Student(String name,int stuNo,int year,Course c1,Course c2,Course c3){
        this.name=name;
        this.stuNo=stuNo;
        this.year=year;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.isPass=false;
        calcAvg();
    }

    void addBulkExamNote(int c1,int c2,int c3){
        if(c1 >=0 && c1<=100)
            this.c1.grade=c1;
        if(c2 >=0 && c2<=100)
            this.c2.grade=c2;
        if(c3 >=0 && c3<=100)
            this.c3.grade=c3;
    }
    void isPass(){
        if(c1.grade==0 || c2.grade==0 || c3.grade==0) {
            System.out.println("Notlar eksik girilmiş");
        }else{
            this.isPass=isCheckPass();
            printNote();
            if(this.isPass){
                System.out.println("Sınıfı geçtiniz");
            }else{
                System.out.println("Sınıfta kaldınız");
            }
        }
    }

    void printNote() {
        System.out.println(this.name);
        System.out.println(" İlk ders notu "+this.c1.grade);
        System.out.println(" İkinci ders notu "+this.c2.grade);
        System.out.println(" Üçüncü ders notu "+this.c3.grade);
    }

    void calcAvg(){
        this.avg=(c1.grade+c2.grade+c3.grade)/3.0;
    }

    boolean isCheckPass(){
        calcAvg();
        return this.avg>55;
    }
}
