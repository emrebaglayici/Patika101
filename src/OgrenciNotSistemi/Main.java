package OgrenciNotSistemi;

public class Main {
    public static void main(String[] args) {
        Course c1=new Course("Matematik","MAT101","MAT");
        Course c2=new Course("Fizik","FZK101","FZK");
        Course c3=new Course("Kimya","KIM101","KIM");

        Teacher t1=new Teacher("Uras TOS","111","MAT");
        Teacher t2=new Teacher("Ahmet TOS","222","FZK ");
        Teacher t3=new Teacher("Mehmet TOS","333","KIM");

        c1.addTeacher(t1);
        c2.addTeacher(t2);
        c3.addTeacher(t3);



        Student student=new Student("Emre",123,4,c1,c2,c3);
        student.addBulkExamNote(100,60,45);
        student.isPass();

        Student student2=new Student("Elif",124,3,c1,c2,c3);
        student2.addBulkExamNote(100,90,65);
        student2.isPass();


    }
}
