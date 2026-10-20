/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wix1002lab2;

/**
 *
 * @author Miten
 */
import java.util.Random;
public class Exercise3 {
    public static void main(String[] args){
        Random random=new Random();
        int num1=random.nextInt(10,51);
        int num2=random.nextInt(10,51);
        int num3=random.nextInt(10,51);
        
        int sum=num1+num2+num3;
        double average=sum/(double)3;
        
        System.out.println("Number 1: "+num1);
        System.out.println("Number 2: "+num2);
        System.out.println("Number 3: "+num3);
        System.out.println("Sum of the numbers: "+sum);
        System.out.printf("Average: %.2f",average);
               
        
        
    }

    
}
