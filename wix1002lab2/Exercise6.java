/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wix1002lab2;

/**
 *
 * @author Miten
 */


import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of water in gram: ");
        double grams = input.nextDouble();

        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double initialF = input.nextDouble();

        System.out.print("Enter the final temperature in Fahrenheit: ");
        double finalF = input.nextDouble();

        double mass = grams / 1000.0;
        double initialC = (initialF - 32) / 1.8;
        double finalC = (finalF - 32) / 1.8;

        double energy = mass * (finalC - initialC) * 4184;

        System.out.printf("The energy needed is %.6e",energy);
    }
}

    

