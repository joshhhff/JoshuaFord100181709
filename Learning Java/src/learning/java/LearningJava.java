/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package learning.java;
/**
 *
 * @author jjmfo
 */

import java.util.Scanner;
public class LearningJava {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("What is your name?:");

        String name = myObj.nextLine();
        System.out.println("Hello " + name + "!");
    }
}
