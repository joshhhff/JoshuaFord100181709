package learning.java;

import java.util.Scanner;

public class HeightWidthRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter width of rectangle:");
        int width = in.nextInt();

        System.out.println("Enter length of rectangle:");
        int length = in.nextInt();

        int perimeter = width*2 + length*2;
        int area = width * length;
        System.out.println("The perimeter of the rectangle is " + perimeter);
        System.out.println("The area of the rectangle is " + area);
    }
}
