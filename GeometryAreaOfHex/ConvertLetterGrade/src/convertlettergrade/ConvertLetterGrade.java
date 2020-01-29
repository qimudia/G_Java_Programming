/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertlettergrade;
import java.util.Scanner;
/**
 *
 * @author Queen
 */
public class ConvertLetterGrade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        //initialize variables
        String A = "A";
        String B = "B";
        String C = "C";
        String D = "D";
        String F = "F";
        
        //Prompt users for input
        System.out.print("Enter a letter grade: ");
        String grade = input.nextLine();
        
        //calculate grade
        if(grade.equals(A)){
            System.out.println("The numeric value for grade " + grade + " is 4");
        }else if(grade.equals (B)){
            System.out.println("The numeric value for grade " + grade + " is 3");
        }else if(grade.equals (C)){
            System.out.println("The numeric value for grade " + grade + " is 2");
        }else if(grade.equals(D)){
            System.out.println("The numeric value for grade " + grade + " is 1");
        }else if(grade.equals(F)){
            System.out.println("The numeric value for grade " + grade + " is 0");
        }else{
            System.out.println("Invalid grade");
        }
    }
    
}
