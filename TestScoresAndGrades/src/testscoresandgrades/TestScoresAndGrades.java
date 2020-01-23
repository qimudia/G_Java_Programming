/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testscoresandgrades;
import java.util.Scanner;

/**
 *
 * @author Queen Imudia
 */
public class TestScoresAndGrades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner object to use the method of the scanner class
        Scanner input = new Scanner(System.in);
        
        //prompt user for first input
        System.out.println("Enter your first test score: ");
        //Use the nextDouble of the scanner class to input value
        double first = input.nextDouble();
        
        //prompt user for second input
        System.out.println("Enter your second test score: ");
        //Use the nextDouble of the scanner class to input value
        double second = input.nextDouble();
        
        //prompt user for third input
        System.out.println("Enter your third test score: ");
        //Use the nextDouble of the scanner class to input value
        double third = input.nextDouble();
        
        //Calculate the scores
        double average = (first + second + third)/3;
        
        if(average >= 90){
            System.out.println("Your grade is " + average + " A");
        }else if(average >= 80){
            System.out.println("Your grade is " + average + " B");
        }else if(average >= 70){
            System.out.println("Your grade is " + average + " C");
        }else if(average >= 60){
            System.out.println("Your grade is " + average + " D");
        }else if(average < 60){
            System.out.println("Your grade is " + average + " F");
        }
    }
    
}
