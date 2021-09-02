package solid;
//4th following
interface SubscribeCodingCourse{
    public void CodingCourse();
}
interface SubscribeAptitudeCourse{
   public void AptitudeCourse();
}

interface SubscribeVerbalCourse{
   public void subscribeVerbalCourse();


}
public class Course implements SubscribeAptitudeCourse,SubscribeCodingCourse
{
    public void CodingCourse(){
        //enroll for coding
    }
    public void AptitudeCourse(){
        //enroll for aptitude
    }
}