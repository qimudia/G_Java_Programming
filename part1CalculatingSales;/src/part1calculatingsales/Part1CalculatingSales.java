/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part1calculatingsales;
import java.util.Scanner;

/**
 *
 * @author young
 */
public class Part1CalculatingSales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        
       final double product1 = 2.98; 
       final double product2 = 4.50; 
       final double product3 = 9.98; 
       final double product4 = 4.49; 
       final double product5 = 6.87;  

       double productPrice1 = 0;
       double productPrice2 = 0;
       double productPrice3 = 0;
       double productPrice4 = 0;
       double productPrice5 = 0;
       int productNumber = 0;
       
       while (productNumber != -1)
      {    
        
       //Prompt user for product number
       
        System.out.print("Please enter product number: ");
        productNumber = input.nextInt();
        
        //Prompt user for for quantity
        System.out.print("Please enter quantity sold: ");
        int quantitySold = input.nextInt();
        
        //System.out.print("Enter -1 when finished.");
        
              
        switch(productNumber){
            case 1: productPrice1 = product1 * quantitySold; break;
            case 2: productPrice2 = product2 * quantitySold; break;
            case 3: productPrice3 = product3 * quantitySold; break;
            case 4: productPrice4 = product4 * quantitySold; break;
            case 5: productPrice5 = product5 * quantitySold; break;
            default:
                System.out.println("Error: Invalid input");
                
        }
         double total = (productPrice1 + productPrice2 + productPrice3 + productPrice4 + productPrice5);
        System.out.print("The total retail value of all products sold is: $" + total);
        //Exit when done
        System.out.print("Enter -1 when finished: ");
         productNumber = input.nextInt();   
      }
        
    }
   
    }
    

