package college;
//interface segregation not following
public interface SubscribeCourses{
    void subscribeCodingCourse();

    void subscribeAptitudeCourse();

    void subscribeVerbalCourse();

}
class Course implements SubscribeCourses{
    @Override
    public void subscribeCodingCourse() {

    }

    @Override
    public void subscribeAptitudeCourse() {

    }

    @Override
    public void subscribeVerbalCourse() {

    }
    /*Here we need to implement all the methods of interface even if we dont need some of them */
}

/*Here a student may not require all the courses .
if we can segregate it into three classes then each student can subscribe to the courses he needed without subscribing to the unnecessary courses*/


