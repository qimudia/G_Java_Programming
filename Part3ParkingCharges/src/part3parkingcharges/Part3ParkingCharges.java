/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part3parkingcharges;
import java.util.Scanner;

/**
 *
 * @author young
 */
public class Part3ParkingCharges {

    /**Part 3– Parking Charges
A parking garage charges a $2.00 minimum fee to park for up to three hours. 
* The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three hours. 
* The maximum charge for any given 24-hour period is $10.00. 
* Assume that no car parks for longer than 24 hours at a time. 
* Write an application that calculates and displays the parking charges for each customer who parked in the garage yesterday. 
* You should enter the hours parked for each customer. 
* The program should display the charge for the current customer and 
* should calculate and display the running total of yesterday’s receipts. 

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        calculate();
    }
    
    public static void calculate(){
        Scanner input = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter the number of hours parked: ");
        double hourParked = input.nextDouble();
        
// initialize variables
        double initialHourFee = 2.00;
        double additionalHoursParked = 0;
        double additionalHoursFee = 0.50;
        double maximumHoursParked = 24;
        double totalCost = 0;
        double maximumFee = 10.00;
        
//Calculate hours and fees
        if(hourParked <= 3){
            System.out.print("Your total cost is $" + initialHourFee);
        }else if(hourParked > 3 && hourParked <= 19){
           additionalHoursParked = hourParked - 3;
           totalCost = (additionalHoursParked * additionalHoursFee) + initialHourFee;
           System.out.print("Your running total is $" + totalCost);
           
        }else if (hourParked >= 20 || hourParked == maximumHoursParked){
            System.out.print("Your running total for yesterday is $" + maximumFee);
            
        }else{
            System.out.print("Your input is invalid");
                    
            
        }
        
    }
    
}
