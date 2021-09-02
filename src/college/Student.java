package college;
//SRP
public class Student {
    private Integer studentId;
    private Float marks;
    void getStudentId(){
        System.out.println("Id");
    }

     void getStudentMarks(){

        System.out.println("marks");
    }

    void getStudentReport(Student student){
        System.out.println("report");
    }
}



/*If we want to get student grade based on his marks we are not going to add this functionality in the student class as it voilates Single responsiblity principle*/




