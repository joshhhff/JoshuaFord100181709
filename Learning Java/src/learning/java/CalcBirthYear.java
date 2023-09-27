package learning.java;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class CalcBirthYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your birth year: ");
        int birthYear = in.nextInt();

        System.out.println("Enter your birth month: ");
        int birthMonth = in.nextInt();

        System.out.println("Enter your birth day: ");
        int birthDay = in.nextInt();

        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);

        Period period = Period.between(birthDate, today);
        long ageInDays = period.getYears() * 365 + period.getMonths() * 30 + period.getDays();

        System.out.println("You are " + ageInDays + " days old.");
    }
}