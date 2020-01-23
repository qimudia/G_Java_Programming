/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromeinteger;
import java.util.Scanner;

/**
 *
 * @author Queen Imudia
 */
public class PalindromeInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a three-digit integer: ");
        int digits = input.nextInt();
        
        int originalInt = digits;
        int reversedInt = 0;
        int leftOverDigit;
        
        while(digits != 0){
            leftOverDigit = digits % 10;
            reversedInt = reversedInt * 10 + leftOverDigit;
            digits /= 10;
        }
        if(originalInt == reversedInt ){
            System.out.println(originalInt + " is a palindrome.");
         }else{
            System.out.println(originalInt + " is not a palindrome.");
        }
            
        
    }
    
}
