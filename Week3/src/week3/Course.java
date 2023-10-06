package week3;

public class Course {
    private String courseCode;
    private String courseName;

    public Course(String courseCode, String courseName){
        this.courseCode=courseCode;
        this.courseName=courseName;
    }

    public void printCourse(){
        System.out.println(courseCode+": "+courseName);
    }

    public String getCourseCode(){
        return this.courseCode;
    }

    public String getCourseName(){
        return this.courseName;
    }
}
