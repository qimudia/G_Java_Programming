/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Queen Imudia
 */
public class FinalProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO code application logic here
        RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
        RetailItem item2 = new RetailItem("Designer Jeans", 40, 34.95);
        RetailItem item3 = new RetailItem("Shirt", 20, 24.95);
        
       //Prompt user for quantity
        System.out.print("Enter the quantity of items that you want to purchase: ");
        int quantity = input.nextInt();
        CashRegister cashRegister = new CashRegister(item1, quantity);
        
        System.out.print("\nSALES RECEIPT");
        System.out.print("\nUnit Price: $" + item1.getPrice());
        System.out.print("\nQuantity: " + quantity);
        System.out.printf("\nSales Subtotal: $ %.2f", cashRegister.getSubtotal());
        System.out.printf("\nAmount of Sales Tax: $ %.2f", cashRegister.getTax());
        System.out.printf("\nTotal Amount of Sales: $ %.2f", cashRegister.getTotal());
        
        //Prompt user for quantity of item2
        System.out.print("\n\nEnter the quantity of item 2 that you want to purchase: ");
        int quantity2 = input.nextInt();
        cashRegister = new CashRegister(item2, quantity2);
        
        System.out.print("\nSALES RECEIPT");
        System.out.print("\nUnit Price: $" + item2.getPrice());
        System.out.print("\nQuantity: " + quantity);
        System.out.printf("\nSales Subtotal: $ %.2f", cashRegister.getSubtotal());
        System.out.printf("\nAmount of Sales Tax: $ %.2f", cashRegister.getTax());
        System.out.printf("\nTotal Amount of Sales: $ %.2f", cashRegister.getTotal());
        
        //Prompt user for quantity of item3
        System.out.print("\n\nEnter the quantity of item 3 that you want to purchase: ");
        int quantity3 = input.nextInt();
        cashRegister = new CashRegister(item3, quantity3);
        
        System.out.print("\nSALES RECEIPT");
        System.out.print("\nUnit Price: $" + item3.getPrice());
        System.out.print("\nQuantity: " + quantity);
        System.out.printf("\nSales Subtotal: $ %.2f", cashRegister.getSubtotal());
        System.out.printf("\nAmount of Sales Tax: $ %.2f", cashRegister.getTax());
        System.out.printf("\nTotal Amount of Sales: $ %.2f", cashRegister.getTotal());
        
        
    }
    
}
