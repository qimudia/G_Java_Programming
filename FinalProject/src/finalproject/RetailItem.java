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
public class RetailItem {
    //Items in the retail store/feilds
    String description;
    int unitsOnHand;
    double price;
    
public RetailItem( String description, int unitsOnHand, double price ) {
    this.description = description;
    this.unitsOnHand = unitsOnHand;
    this.price = price;
}
public String getDescription(){
    return description;
}
public void setDescription(String description){
    this.description = description;
}
public int getUnitsOnHand(){
    return unitsOnHand;
}
public void setUnitsOnHand(int unitsOnHand){
    this.unitsOnHand = unitsOnHand;
}
public double getPrice(){
    return price;
}
public void setPrice(double price){
    this.price = price;
}
    
    
}
