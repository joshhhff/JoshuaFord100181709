package week2;

import java.util.Scanner;

public class TimesTable {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String restart;

        do {
            int user;
            while (true) {
                System.out.println("Enter whole number:");
                if (!in.hasNextInt()) { // If the next input from the Scanner object "in" is not an integer
                    System.out.println("Error: Enter a number");
                    in.next();  // Discard last input and try again
                } else {
                    user = in.nextInt();
                    break;
                }
            }

            for(int i=1; i<13; i++){
                System.out.println(i*user);
            }

            do {
                System.out.println("Do you want to restart the program? (yes/no)");
                restart = in.next().toLowerCase();
                if (!restart.equals("yes") && !restart.equals("no")) {
                    System.out.println("Error: Invalid input. Please enter 'yes' or 'no'.");
                }
            } while (!restart.equals("yes") && !restart.equals("no"));

        } while (restart.equals("yes"));

        System.out.println("Goodbye!");
    }
}
