package foodi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miino
 */

import java.util.Scanner;

public class orderclass {
    
Scanner input=new Scanner(System.in);  
    
    
    
//attributes
private int orderID;
private int orderPrice;

//empty constructor

    public orderclass() {
    }

    // constructor
    public orderclass(int orderID, int orderPrice) {
        this.orderID = orderID;
        this.orderPrice = orderPrice;
    }
    
    
    //setter methods

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }
    
    
    //getter methods

    public int getOrderID() {
        return orderID;
    }

    public int getOrderPrice() {
        return orderPrice;
    }
    
    
    // methods
    
public String displayOrderDetails(int orderID, int orderPrice){
    
    return "Order Details :" + "/n order ID : " + orderID + ", Order Price = " + orderPrice;
    
    }


public void deleteOrder(){

System.out.println("Do you want to delete your order ( inter Y for yes // N for no) ");
String choice;
choice=input.next();
if(choice.equalsIgnoreCase("Y"))
System.out.println("Oreder is deleted ! ");

}    
    
    
    
    
    
}
