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
public class maindishclass extends menuclass {
    
//attributes
    static int numOfMainDishes;

    //empty constructor
    public maindishclass() {
    }
    
    //constructor

    public maindishclass(int dishID, String dishName, int price, String itemType) {
        super(dishID, dishName, price, itemType);
    }    
    
    
}
