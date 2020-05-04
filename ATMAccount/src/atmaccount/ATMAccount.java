/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmaccount;
import java.util.Scanner;

/**
 *
 * @author Queen Imudia
 */
public class ATMAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        TestATMAccount[] accounts = new TestATMAccount[10];
        
        for(int i = 0; i < accounts.length; i++){
            accounts[i] = new TestATMAccount(i, 100);
        }
        
        int choices = 0;
        int id = askUserForId(accounts);
        while (choices < 1 || choices != 4){
         TestATMAccount users = getTestATMAccount(accounts, id);
            //System.out.print("Enter an id: ");
            //choices = input.nextInt();
            System.out.print(" \n");
            System.out.print("Main menu\n");
            System.out.print("1: check balance\n");
            System.out.print("2: withdraw\n");
            System.out.print("3: deposite\n");
            System.out.print("4: exit\n");
            System.out.print("Enter a choice: ");
            choices = input.nextInt();
            //System.out.print(" ");
         switch(choices){
            case 1:
                System.out.print("The balance is $" + users.getBalance());
                break;
            case 2: 
               System.out.print("Enter the amount to withdraw: $");
               users.withdraw(input.nextDouble());
               break;
            case 3:
               System.out.print("Enter the amount to deposit: $");
               users.deposite(input.nextDouble());
               break;
            case 4:
               //System.out.print("Enter an id: ");
                id = askUserForId(accounts);
                choices = 0;
               break;
            default:
                System.out.print("Invalid input");
                System.out.print(" Enter a number: ");
                choices = input.nextInt();
               
        }
    }
  }
   
        
        
        
    public static int askUserForId(TestATMAccount[] accounts){
        Scanner input = new Scanner(System.in);
        
        int id = 0;
        boolean validId = false;
        
        while(!validId){
            System.out.print("Enter an id: ");
            id = input.nextInt();
            
            if(id < 1 || id >= 10){
                System.out.print("Invalid id ");
                //System.out.print(" Enter an id");
            }else{
                validId = true;
            }
        }
        return id;
        
    }    
        
        
        
        
        
    public static TestATMAccount getTestATMAccount (TestATMAccount[] accounts, int id){
      for(TestATMAccount account : accounts)  {
          if(id == account.getId()){
              return account;
          }
      } 
       return null; 
    } 
        
        
        
        
    }
    
