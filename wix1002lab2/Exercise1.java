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
public class Exercise1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double Fah=input.nextDouble();
        double cel=(Fah-32)/1.8;
        System.out.printf("Temperature: %.2f",cel);
        
        
    }
    
            
    
}
