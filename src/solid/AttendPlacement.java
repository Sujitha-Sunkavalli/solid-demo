package solid;
//5th following
interface Exam
{
    void getResults();

}
class CodingExam implements Exam{
void coding(){

    System.out.println("coding exam");
}
public void getResults(){

    System.out.println("coding results");
}
}
class AptitudeExam implements Exam{
void aptitude(){

    System.out.println("apt exam");
}
    public void getResults(){

    System.out.println("aptitude results");
    }
}
public class AttendPlacement{
    private  Exam exam;


    public void AttendPlacements(Exam exam) {

        this.exam = exam;
    }
}


