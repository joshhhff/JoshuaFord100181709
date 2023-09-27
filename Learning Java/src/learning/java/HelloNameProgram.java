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
public class HelloNameProgram {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?:");
        String name = in.next();

        System.out.println("Hello " + name + "!");
    }
}
