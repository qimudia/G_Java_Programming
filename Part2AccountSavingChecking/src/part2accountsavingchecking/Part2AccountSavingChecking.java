/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part2accountsavingchecking;
import java.io.*;
import java.util.Scanner;

/*
 *
 * @author Queen Imudia
 */
public class Part2AccountSavingChecking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        
        //  PrintWriter outputFile = new PrintWriter("StudentData.txt");
        Scanner input = new Scanner(System.in);
//Account details
     int accountNumber;
     char accountType;
     double minBalance;
     double currentBalance;
 
//  Interest and charges  
     double savingsBelowServiceCharge = 10.00;
     double checkingBelowServiceCharge = 25.00;
     double savingsMinBalnceInterest = 0.04;
     double checkingMoreThanMinInterest = 0.03;
     double checkingMaxInterest = 0.05;

// Prompt user for user for account details    
     System.out.print("Please enter your account details: ");
     accountNumber = input.nextInt();
     accountType = input.next().charAt(0);
     minBalance = input.nextDouble();
     currentBalance = input.nextDouble();
     
     switch(accountType){
         case 's':
         case 'S':
             System.out.print("Account number,  Account type,  Current balance,  New balance\n");
             System.out.printf("%8d%16s%16.2f%18.2f\n", accountNumber, accountType, minBalance, currentBalance);
             if(currentBalance < minBalance){
                System.out.printf("You have been charged a service fee of: $ %.2f\n", savingsBelowServiceCharge);
            }else{
                double saveCurrentInterest = currentBalance * savingsMinBalnceInterest;
                currentBalance = currentBalance + saveCurrentInterest;
                System.out.printf("You earn an inerest of: $ %.2f\n", saveCurrentInterest); //+ " at the rate of 4%"); 
                System.out.printf("Your new balance is: $ %.2f\n", currentBalance);
            }
         break;
         case 'c':
         case 'C':
             System.out.print("Account number,  Account type,  Current balance,  New balance\n");
             System.out.printf("%8d%16s%16.2f%18.2f\n", accountNumber, accountType, minBalance, currentBalance);
             if(currentBalance < minBalance){
                System.out.printf("You have been charged a service fee of: $ %.2f\n", checkingBelowServiceCharge);
            }else if(currentBalance <= (minBalance + 5000.00)){
                double newInterest = currentBalance * checkingMoreThanMinInterest;
                currentBalance = currentBalance + newInterest;
                System.out.printf("You earn an interest of: $ %.2f\n", newInterest );//+ " at the rate of 3%"); 
                System.out.printf("Your new balance is: $ %.2f\n", currentBalance);
                
            }else{
                double currentInterest = currentBalance * checkingMaxInterest;
                currentBalance = currentBalance + currentInterest;
                System.out.printf("You earn an inerest of: $ %.2f\n", currentInterest); 
                System.out.printf("Your new balance is: $ %.2f\n", currentBalance);
            }
         break;
         default:
         System.out.println("Your input is invalid");
         break;
             
     }
     
     
     

    }
    
    
    
}

