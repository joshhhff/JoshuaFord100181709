package learning.java;

import java.util.Scanner;
import java.time.LocalDate;
public class CalcBirthYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int age, birthMonth;
        while (true) {
            System.out.println("Enter your age:");
            if (!in.hasNextInt()) { //If the next input from the Scanner object "in" is not an integer
                System.out.println("Error: Enter a number");
                in.next();  //Discard last input and try again
            } else {
                age = in.nextInt();
                break;
            }
        }

        LocalDate today = LocalDate.now();
        int currentYear = today.getYear();
        int currentMonth = today.getMonthValue();

        int birthYear = currentYear - age;

        // If the user's birthday hasn't occurred yet this year, subtract one from the birth year
        while (true) {
            System.out.println("Enter the number of your birth month:");
            if (!in.hasNextInt()) { //If the next input from the Scanner object "in" is not an integer
                System.out.println("Error: Enter a number");
                in.next();  //Discard last input and try again
            } else {
                birthMonth = in.nextInt();
                break;
            }
        }
        if (birthMonth > currentMonth) {
            birthYear--;
        }

        System.out.println("You were born in: " + birthYear);
    }
}
