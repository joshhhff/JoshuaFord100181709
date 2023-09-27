package learning.java;

import java.util.Scanner;

public class ConvertFeetToMiles {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int feet;
        while (true){
            System.out.println("Enter number of feet you want to convert to miles:");
            if (!in.hasNextInt()){
                System.out.println("Error: Enter a number");
                in.next();
            }
            else{
                feet = in.nextInt();
                break;
            }
        }

        System.out.println(feet + "ft converted to miles is: " + feet/5280 + " mile/s");

    }
}
