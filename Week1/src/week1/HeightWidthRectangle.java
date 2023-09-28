package week1;

import java.util.Scanner;

public class HeightWidthRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int width, length;  //Declaring width and length variables

        //Validating INTEGER data type
        while (true) {
            System.out.println("Enter width of rectangle:");
            if (!in.hasNextInt()) { //If the next input from the Scanner object "in" is not an integer
                System.out.println("Error: Enter a whole number");
                in.next();  //Discard last input and try again
            } else {
                width = in.nextInt(); //Reads the integer from the user input and assigns to variable
                break;
            }
        }

        //Validating INTEGER data type
        while (true){
            System.out.println("Enter length of rectangle:");

            if (!in.hasNextInt()){
                System.out.println("Error: Enter a whole number");
                in.next();
            } else{
                length = in.nextInt();
                break;
            }
        }

        int perimeter = width*2 + length*2; int area = width * length;

        System.out.println("The perimeter of the rectangle is " + perimeter);
        System.out.println("The area of the rectangle is " + area);
    }
}
