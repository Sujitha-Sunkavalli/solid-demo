package solid;

import college.Student;

/*For student related to computer science needs to have his marks in computer subject along with
all the other marks of students in all the branches.So it can extend student class than to modify the existing one*/
//open for extension following
public class Students{
    private Integer Id;
    private Integer Marks;

    private void getStudentId() {

        System.out.println("id");
    }

     private void getStudentMarks() {

        System.out.println("marks");
    }


}

/*If we want to get specific coding marks we need to add specific functionality of getting that subject marks which
    may lead to violation*/
class ComputerScienceStudents extends Students {

        private Integer codingMarks;

        private void getCodingMarks() {
            System.out.println("coding marks");
        }
    }
    class Mechanical extends Students{
        private Integer subMarks;
        private void getSubMarks() {
            System.out.println("subject marks");
        }

}

/*3 In the above example Student class can be made as a substitute for
 ComputerScienceStudent with out getting any exceptions as all the functionalities there in Student will be there for Computer science student as well*/
