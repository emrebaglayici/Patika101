package MaasHesabi;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    void printInfo(){
        System.out.println(this.name+" \n" +
                "Maaş :"+this.salary+" \n"+
                "Çalışma Saati :"+this.workHours+"\n"+
                "Başlangıç Yılı :"+this.hireYear+"\n"+
                "Vergi :60 \n"+"Bonus :"+"150"+
                "\n"+"Maaş Artışı :300"+"\n"+
                "Vergi + Bonus ile birlikte Maaş :"+calcTaxBonus()+
                "\n"+ "Toplam Maaş :"+totalSalary());
    }
     double calcTaxBonus(){
       return (150-60)+this.salary;
    }

    double totalSalary(){
        return salary+300.0;
    }
}
