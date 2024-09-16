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
public class menuclass {
    
//attributes
    
    int dishID; 
    String dishName;
    int price;
    String itemType;

    //empty constructor
    public menuclass() {
    }
    
    // constructor
    public menuclass(int dishID, String dishName, int price, String itemType) {
        this.dishID = dishID;
        this.dishName = dishName;
        this.price = price;
        this.itemType = itemType;
    }

    // methods
    
   public void displaymainDishes(){
  
   System.out.println("--------------Burgers---------------");    
   System.out.println("  Beef Burger            15 SR      ");
   System.out.println("Double Beef Burger       20 SR      ");
   System.out.println("  Chicken Burger         15 SR      ");
   System.out.println("------------------------------------");
   }

   public void displaysideDishes(){
   
       
   System.out.println("---------------Sides----------------");
   System.out.println("  French Fires            6 SR      ");
   System.out.println("      Wedges              7 SR      ");
   System.out.println("      Nuggets            12 SR      ");
   System.out.println("------------------------------------");    
       
   }
   
   public void displaydrinks(){
   System.out.println("--------------Drinks---------------");
   System.out.println("      7UP                 3 SR      ");
   System.out.println("      Mirinda             5 SR      ");
   System.out.println("      Pepsi               4 SR      ");
   System.out.println("------------------------------------");    
       
   }    
    
    
    
    
}
