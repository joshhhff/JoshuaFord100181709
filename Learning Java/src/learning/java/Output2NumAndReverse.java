package learning.java;

import java.util.Scanner;
public class Output2NumAndReverse {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int firstNum, secondNum;
        while (true) {
            System.out.println("Enter first number:");
            if (!in.hasNextInt()) { //If the next input from the Scanner object "in" is not an integer
                System.out.println("Error: Enter a number");
                in.next();  //Discard last input and try again
            } else {
                firstNum = in.nextInt();
                break;
            }
        }

        while (true) {
            System.out.println("Enter second number:");
            if (!in.hasNextInt()) { //If the next input from the Scanner object "in" is not an integer
                System.out.println("Error: Enter a number");
                in.next();  //Discard last input and try again
            } else {
                secondNum = in.nextInt();
                break;
            }
        }

        System.out.println("Original order: " + firstNum + " and " + secondNum);
        System.out.println("Reversed order: " + secondNum + " and " + firstNum);
    }
}
