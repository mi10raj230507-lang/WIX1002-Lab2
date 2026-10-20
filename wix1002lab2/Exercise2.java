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
public class Exercise2 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("The price of the car: ");
        double P=input.nextDouble();
        System.out.print("Down payment: ");
        double D=input.nextDouble();
        System.out.print("Interest rate in %: ");
        double R=input.nextDouble();
        System.out.print("Loan duration in year: ");
        double Y=input.nextDouble();
        double M=(P-D)*(1+R*Y/100)/(Y*12);
        System.out.printf("Monthly payment: %.2f",M);
        
    }

    
}
