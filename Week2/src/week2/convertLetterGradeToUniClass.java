package week2;

import java.util.Scanner;
public class convertLetterGradeToUniClass {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(true){

            System.out.println("Enter letter grade to convert to university classification:");
            String grade = in.next().toUpperCase();

            if (grade.equals("A")){System.out.println("Your university equivalent grade is: 1st"); break;}
            else if (grade.equals("B")){System.out.println("Your university equivalent grade is: 2:1"); break;}
            else if (grade.equals("C")){System.out.println("Your university equivalent grade is: 2:2"); break;}
            else if (grade.equals("D")){System.out.println("Your university equivalent grade is: 3rd"); break;}
            else if (grade.equals("E")){System.out.println("Your university equivalent grade is: Ordinary"); break;}
            else if (grade.equals("F")){System.out.println("Your university equivalent grade is: Fail"); break;}
            else{
                System.out.println("Error: Please try again");
            }
        }

    }
}
