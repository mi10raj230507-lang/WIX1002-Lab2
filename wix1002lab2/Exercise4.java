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
public class Exercise4 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int seconds=input.nextInt();
        int  hours=seconds/3600;
        int remainingseconds=seconds%3600;
        int minutes=remainingseconds/60;
        int rms2=remainingseconds%60;
        
        System.out.print(seconds+" seconds is "+hours+" hours, "+minutes+" minutes and "+rms2+" seconds");
        
    }

    
}
