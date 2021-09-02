/*If we want to get student grade based on his marks we are not going to add this functionality in the student class as
it violates Single responsibility principle*/
/*We create seperate class with specific functionality so that it is responsible for only single use*/



package solid;

import college.Student;

 class StudentDetails{

    void getStudentReport(Student student){
        System.out.println("prints all the report of student");
    }
}
 class Marks{
    public void getStudentMarks(){
       System.out.println("prints marks");
    }
}

class Details{
public void getId()
{
    System.out.println("Prints student id");
}
}
