package learning.java;

import java.util.Scanner;

public class ConvertFeetToMiles {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        float feet;
        while (true){
            System.out.println("Enter number of feet you want to convert to miles:");
            if (!in.hasNextFloat()){
                System.out.println("Error: Enter a number");
                in.nextFloat();
            }
            else{
                feet = in.nextFloat();
                break;
            }
        }

        float convertToMiles = feet / 5280;

        System.out.println(feet + "ft converted to miles is: " + convertToMiles + " mile/s");

    }
}
