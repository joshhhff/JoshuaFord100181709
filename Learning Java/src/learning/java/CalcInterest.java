package learning.java;

import java.util.Scanner;
import java.text.DecimalFormat;
public class CalcInterest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("##.00");

        float deposit;
        while(true){
            System.out.println("Enter your deposit amount:");
            if(!in.hasNextFloat()){
                System.out.println("Error: Enter a number");
                in.nextFloat();
            }
            else{
                deposit = in.nextFloat();
                break;
                }
            }

        double interestRate = 0.01;
        double total = deposit + (deposit*interestRate);

        System.out.println("After interest (1% per year) your £" + deposit + " will increase to: £" + f.format(total));
    }
}
