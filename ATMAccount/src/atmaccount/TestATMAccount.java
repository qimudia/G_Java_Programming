/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmaccount;

import java.util.Date;

/**
 *
 * @author Queen Imudia
 */
public class TestATMAccount {
    protected int id;
    protected double balance;
    protected double IannualInterestRate;
    protected Date dateCreated;
     
    
    public TestATMAccount(){
        this.id = 0;
        this.balance = 0;
        this.IannualInterestRate = 0;
        
    }
    
    public TestATMAccount(int id, double balance){
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
        
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(){
        id = id;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void setBalance( double balance){
        balance = balance;
    }
    
    public double getAnnualInterestRate(){
        return IannualInterestRate;
        
    }
    
    public void setAnnualInterestRate(double annualInterestRate){
        IannualInterestRate = annualInterestRate;
        
    }
    
    public Date getDateCreated(){
        return dateCreated;
    }
    
    public double getMonthlyInterestRate(){
        return balance * (IannualInterestRate / 12)/ 100;
    }
    
    public double withdraw(double amount){
        balance = balance - amount;
        return balance;
        
    }
    
    public double deposite(double amount){
        balance = balance + amount;
        return balance;
        
        
    }
    
}

    

