/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loanwithvinterest;

import java.util.Scanner;

/**
 *
 * @author Queen
 */
public class LoanWithVInterest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        //Promt user for loan amount
        System.out.print("Enter Loan Amount: ");
        double loanAmount = input.nextDouble();

        //Promt for number of years
        System.out.print("Enter Number of Years: ");
        int numOfYears = input.nextInt();

        double annualIntRate = 5.0;

        //Print tabel header
        System.out.printf("%-18s%-18s%-18s\n", "Interest Rate  ", " Monthly Payment ", "Total Payment");

        while (annualIntRate <= 8.0) {
            double monthIntRate = annualIntRate / 12;

            //Calculate payment
            double monthlyPayment = loanAmount * monthIntRate
                    / (1 - 1 / Math.pow(1 + monthIntRate, numOfYears * 12));
            double totalPayment = monthlyPayment * numOfYears * 12;

            //Result
            System.out.printf("%-18.3f%-18.2f%-18.2f\n", annualIntRate, monthIntRate, totalPayment);

            annualIntRate = annualIntRate + 1.0 / 8;
        }
    }
}
