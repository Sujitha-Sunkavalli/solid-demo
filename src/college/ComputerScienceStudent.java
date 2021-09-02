package college;
//liscov following
class Studnt{
    private Integer id;
    private Integer marks;
    Studnt(){

    }
    Studnt(Integer id,Integer marks){
        this.id=id;
        this.marks=marks;
    }
    void getStudentId() {

        System.out.println("id");
    }

    void getStudentMarks() {

        System.out.println("marks");
    }
    void getDrawingMarks(Student s){
        System.out.println("Computer science student do not have mechanical marks");
    }
    void getCodingMarks(Student s)
    {

        System.out.println("get marks of student");
    }
}
public class ComputerScienceStudent extends Studnt{

    public static void main(String args[]){
        ComputerScienceStudent c=new ComputerScienceStudent();
        Student s=new Student();
        c.getStudentId();
        c.getStudentMarks();
        c.getDrawingMarks(s);
        c.getCodingMarks(s);

    }
}
