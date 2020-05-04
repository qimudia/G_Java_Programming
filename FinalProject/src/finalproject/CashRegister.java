/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author Queen Imudia
 */
public class CashRegister {
    RetailItem retailItem;
    int quantity;
    double subtotal;
    double tax;
    double total;
    //RetailItem price;
    
   public CashRegister(RetailItem retailItem, int quantity) {
       this.retailItem = retailItem;
       this.quantity = quantity;
      
   }
   public RetailItem getRetailItem(){
       return retailItem;
   }
   public void setRetailItem(RetailItem retailItem){
       this.retailItem = retailItem;
   }
   public int getQuantity(){
       return quantity;
   }
   public void setQuantity(int quantity){
       this.quantity = quantity;
   }
   public double getSubtotal(){
       subtotal =(this.quantity * this.retailItem.getPrice());
       return subtotal;
   }
   public double getTax(){
       return tax =(((this.quantity * this.retailItem.getPrice())/100)* 6);
   }
    public double getTotal(){
       return ((this.quantity * this.retailItem.getPrice())+ tax);
   }
    
    
   
}
