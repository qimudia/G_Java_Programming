/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cornerpointcoor;
import java.util.Scanner;

/**
 *
 * @author Queen
 */
public class CornerPointCoor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        //Prompt users for input
        System.out.print("Enter the radius of the bounding circle: ");
        double radius = input.nextDouble();
        
        //Calculate angles
        double rad1 = Math.PI/10;
        double rad2 = Math.PI/2;
        double rad3 = Math.PI/ 2 + 2 * Math.PI / 5;
        double rad4 = Math.PI/ 2 + 4 * Math.PI / 5;
        double rad5 = Math.PI/ 2 + 6 * Math.PI / 5;
        
        //Calculate the coordinates
        double radx1 = radius * Math.cos(rad1);
        double rady1 = radius * Math.sin(rad1);
        
        double radx2 = radius * Math.cos(rad2);
        double rady2 = radius * Math.sin(rad2);
        
        double radx3 = radius * Math.cos(rad3);
        double rady3 = radius * Math.sin(rad3);
        
        double radx4 = radius * Math.cos(rad4);
        double rady4 = radius * Math.sin(rad4);
        
        double radx5 = radius * Math.cos(rad5);
        double rady5 = radius * Math.sin(rad5);
        
        //Print out the coordinates/ display
        System.out.println("The coordinates of five point on the pentagon are ");
        System.out.println("(" + radx1 +", "+rady1 + ")");
        System.out.println("(" + radx2 +", "+rady2 + ")");
        System.out.println("(" + radx3 +", "+rady3 + ")");
        System.out.println("(" + radx4 +", "+rady4 + ")");
        System.out.println("(" + radx5 +", "+rady5 + ")");
        
        
    }
    
}
