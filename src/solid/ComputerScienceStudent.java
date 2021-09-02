package solid;
//liscov following
 class Student{
    private Integer id;
    private Integer marks;
    Student(){

    }
    Student(Integer id,Integer marks){
    this.id=id;
    this.marks=marks;
}
    void getStudentId() {

        System.out.println("id");
    }

    void getStudentMarks() {

        System.out.println("marks");
    }
}
public class ComputerScienceStudent extends Student{
     void getCodingMarks(Student s)
    {
       System.out.println("get marks of student");
    }
    public static void main(String args[]){
         ComputerScienceStudent c=new ComputerScienceStudent();
         Student s=new Student();
         c.getStudentId();
         c.getStudentMarks();
         c.getCodingMarks(s);
    }
}
