package OgrenciNotSistemi;

public class Course {
    String name;
    String code;
    String prefix;
    int grade;
    Teacher teacher;

    Course(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.grade=0;
    }

    void addTeacher(Teacher teacher){
        if(this.prefix.equals(teacher.branch))
            this.teacher=teacher;
        else
            System.out.println(teacher.name + " bu dersi veremez");

    }

    void printTeacher(){
        if(teacher.name!=null){
            System.out.println(this.name+" dersinin hocası : "+teacher.name);
        }else{
            System.out.println(this.name+" dersine öğretmen atanmamıştır");
        }
    }
}
