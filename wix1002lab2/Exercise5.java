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

public class Exercise5 {

    public static void main(String[] args) {
        Random random = new Random();
        int RN = random.nextInt(0, 10001);
        int LP=RN;
        int sum = 0;
        while (LP > 0) {
            int digit = LP % 10;
            sum = sum + digit;
            LP = LP / 10;
        }
        System.out.println("Random Number: " + RN);
        System.out.println("Sum of digits: " + sum);

    }

}
