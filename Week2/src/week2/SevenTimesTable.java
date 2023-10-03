package week2;

import java.util.Scanner;

public class SevenTimesTable {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

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
    }
}
