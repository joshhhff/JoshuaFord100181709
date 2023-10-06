package week3;

public class Student {

    private int studentID;
    private String studentName;
    private Course myCourse;

    public Student(int studentID, String studentName){
        this.studentID=studentID;
        this.studentName=studentName;
    }

    public void printStudent(){
        System.out.println(String.valueOf(studentID) +": "+studentName);
        System.out.println(myCourse.getCourseName() + ": " + myCourse.getCourseCode());
    }

    public void enroll(Course myCourse){
        this.myCourse=myCourse;
    }

    public Course getCourse(){
        return this.myCourse;
    }
}
