/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmajorandstatus;
import java.util.Scanner;

/**
 *
 * @author Queen Imudia
 */
public class StudentMajorAndStatus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter two characters: ");
        String status = input.nextLine();
        
        char studMajor = Character.toUpperCase(status.charAt(0));
        char studYear = status.charAt(1);
        
        String nameOfMajor = " ";
        String studLevel = " ";
        
        switch (studMajor){
            case 'M':
                nameOfMajor = "Mathematics";
                break;
            case 'C':
                nameOfMajor = "Computer Science";
                break;
            case 'I':
                nameOfMajor = "Information Technology";
                break;
            default:
                System.out.println("Invalid input");
                System.exit(0);
        }
        
        switch(studYear){
            case '1':
                studLevel = "Freshman";
                break;
            case '2':
                studLevel = "Sophomore";
                break;
            case '3':
                studLevel = "Junior";
                break;
            case '4':
                studLevel = "Senior";
                break;
            default:
                System.out.println("Invalid input");
                System.exit(0);
                break;
        }
        System.out.println(nameOfMajor + " " + studLevel);
    }
    
}
