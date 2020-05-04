/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findsmallestelement;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author young
 */
public class FindSmallestElement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double [] myList = new double[10];
        System.out.print("Enter " +myList.length+ " numbers: ");
        for(int i = 0; i < myList.length; i++){
            System.out.println();
            myList[i] = input.nextDouble();
        }
        // Display the minimum
         System.out.println("The minimum number is " + min(myList));    
    }
    public static double min(double[] array){
        
        double smallest = array[0];
        int indexOfSmallest = 0;
        for(int i = 0; i < array.length; i++){
            if (array[i] < smallest){
                smallest = array[i];
                indexOfSmallest = i;
            }
        }
        
        return smallest;
    }
    
}
