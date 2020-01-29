/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometryareaofhex;
import java.util.Scanner;
/**
 *
 * @author Queen Imudia
 */
public class GeometryAreaOfHex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        //prompt users for input
        System.out.print("Enter the side: ");
        double side = input.nextDouble();
        
        // calculate area
        double area = (6*(Math.pow(side, 2)))/(4*(Math.tan(Math.PI/6)));
        //area = 6 * Math.pow(side * side)/(4 * Math.PI/6)));
        System.out.println("The area of the hexagon is " + area);
    }
    
}
