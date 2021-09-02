package college;
//open for extension not following
/*For student related to computer science needs to have his marks in computer subject along with
all the other marks of students in all the branches.So it can extend student class than to modify the existing one*/

public class Students{
    private Integer Id;
    private Integer Marks;
    private Integer Coding;

    void  getStudentId() {
        System.out.println("id");
    }

    void getStudentMarks() {
        System.out.println("marks");
    }

    void getCodingMarks(){
        System.out.println("coding marks");
    }
}
    /*If we want to get specific coding marks we need to add specific functionality of getting that subject marks which
    may lead to violation*/








       /*3 In the above example Student class can be made as a substitute for
 ComputerScienceStudent with out getting any exceptions as all the functionalities there in Student will be there for Computer science student as well*/
