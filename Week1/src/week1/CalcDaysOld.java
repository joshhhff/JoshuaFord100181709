package week1;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class CalcDaysOld {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int birthYear, birthMonth, birthDay;

        while (true) {
            System.out.println("Enter your birth year:");
            if (!in.hasNextInt()) { // If the next input from the Scanner object "in" is not an integer
                System.out.println("Error: Enter a number");
                in.next();  // Discard last input and try again
            } else {
                birthYear = in.nextInt();
                // Check if the birth year is a 4-digit number
                if (birthYear < 1000 || birthYear > 9999) {
                    System.out.println("Error: Enter a 4-digit number");
                } else {
                    break;
                }
            }
        }

        while (true) {
            System.out.println("Enter your birth month:");
            if (!in.hasNextInt()) { //If the next input from the Scanner object "in" is not an integer
                System.out.println("Error: Enter a number");
                in.next();  //Discard last input and try again
            } else {
                birthMonth = in.nextInt();

                if (birthMonth>=1 && birthMonth<=12){
                    break;
                } else{
                    System.out.println("Enter a valid number for month. (1-12)");
                    in.next();
                }
            }
        }

        while (true) {
            System.out.println("Enter your birth day:");
            if (!in.hasNextInt()) { //If the next input from the Scanner object "in" is not an integer
                System.out.println("Error: Enter a number");
                in.next();  //Discard last input and try again
            } else {
                birthDay = in.nextInt();

                if (birthDay>=1 && birthDay<=31){
                    break;
                } else{
                    System.out.println("Enter a valid number for days of the month. (1-31)");
                    in.next();
                }
                break;
            }
        }

        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);

        Period period = Period.between(birthDate, today);
        long ageInDays = period.getYears() * 365 + period.getMonths() * 30 + period.getDays();

        System.out.println("You are " + ageInDays + " days old.");
    }
}