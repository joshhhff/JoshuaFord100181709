package learning.java;

import java.util.Scanner;
public class Average2Num {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        float firstNum, secondNum;
        while (true) {
            System.out.println("Enter first number:");
            if (!in.hasNextFloat()) { //If the next input from the Scanner object "in" is not an integer
                System.out.println("Error: Enter a number");
                in.nextFloat();  //Discard last input and try again
            } else {
                firstNum = in.nextFloat();
                break;
            }
        }

        while (true) {
            System.out.println("Enter second number:");
            if (!in.hasNextFloat()) { //If the next input from the Scanner object "in" is not an integer
                System.out.println("Error: Enter a number");
                in.nextFloat();  //Discard last input and try again
            } else {
                secondNum = in.nextFloat();
                break;
            }
        }

        System.out.println("The average of {" + firstNum + "} and {" + secondNum + "} is: " + (firstNum+secondNum)/2);
    }
}
