package learning.java;

import java.util.Scanner;
import java.time.LocalDate;
public class CalcBirthYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = in.nextInt();

        LocalDate today = LocalDate.now();
        int currentYear = today.getYear();
        int currentMonth = today.getMonthValue();

        int birthYear = currentYear - age;

        // If the user's birthday hasn't occurred yet this year, subtract one from the birth year
        System.out.println("Enter the number of your birth month: ");
        int birthMonth = in.nextInt();
        if (birthMonth > currentMonth) {
            birthYear--;
        }

        System.out.println("You were born in: " + birthYear);
    }
}
