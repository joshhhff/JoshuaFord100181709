package week2;

import java.util.Scanner;

public class ExamGrade {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int zeroMarks = 0;
        final int gradeFail = 24;
        final int gradeE = 39;
        final int gradeD = 49;
        final int gradeC = 59;
        final int gradeB = 69;
        final int gradeA = 100;

        int mark;
        while (true) {
            System.out.println("Enter your exam mark:");
            if (!in.hasNextInt()) {
                System.out.println("Error: Enter a number");
                in.next();
            } else {
                mark = in.nextInt();

                if (mark >= 0 && mark <= 100) {
                    break;
                } else {
                    System.out.println("Error: Enter a mark between 0-100");
                    in.next();
                }
            }
        }

        if (mark >= zeroMarks && mark <= gradeFail) {
            System.out.println("Grade: F");
        } else if (mark > gradeFail && mark <= gradeE) {
            System.out.println("Grade: E");
        } else if (mark > gradeE && mark <= gradeD) {
            System.out.println("Grade: D");
        } else if (mark > gradeD && mark <= gradeC) {
            System.out.println("Grade: C");
        } else if (mark > gradeC && mark <= gradeB) {
            System.out.println("Grade: B");
        } else{
            System.out.println("Grade: A");
        }
     }
}
