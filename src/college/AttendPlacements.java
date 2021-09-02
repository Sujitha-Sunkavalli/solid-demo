package college;
//DI not following
/*If we could use exam as an attribute rather than coding exam or aptitude exam it will be available for all the students*/
/* Here rather than making the exam to specific type like CodingExam if we can make Exam as abstract class or interface that can be extended by CodingExam,AptitudeExam etc.. */
class CodingExam{

}
class AptitudeExam{

}
public class AttendPlacements
{
    private final CodingExam codingExam;
    public AttendPlacements(){

        codingExam = new CodingExam();
    }
}

