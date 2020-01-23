/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthapplicationbmi;
import java.util.Scanner;

/**
 *
 * @author Queen Imudia
 */
public class HealthApplicationBMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //Prompt the user to enter weight in pounds
        System.out.println("Enter weight in pounds: ");
        double weight = input.nextDouble();
        
        //Prompt the user to enter feet
        System.out.println("Enter feet: ");
        double feet = input.nextDouble();
        
        //Prompt the user to enter height in inches
        System.out.println("Enter inches: ");
        double inches = input.nextDouble();
        
        final double KILOGRAM_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;
        
        //Compute BMI
        double weightInPounds = weight * KILOGRAM_PER_POUND;
        double inchePerFeet = feet * 12;
        double feetAndInches = (inchePerFeet + inches) * METERS_PER_INCH;
        double bmi = weightInPounds/(feetAndInches * feetAndInches);
        
        //Display result
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5){
          System.out.println("Underweight ");   
        }else if (bmi < 25){
          System.out.println("Normal");   
        }else if (bmi < 30){
          System.out.println("Overweight ");   
        }else{
            System.out.println("Obese");
        }
    }
    
}
