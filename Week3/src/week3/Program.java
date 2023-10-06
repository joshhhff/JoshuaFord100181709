package week3;

public class Program {
    public static void main(String[] args){
        Student student1 = new Student(100181709, "Josh");
        Course course1 = new Course("CO452", "Programming Concepts");

        student1.enroll(course1);

        student1.printStudent();

    }
}
