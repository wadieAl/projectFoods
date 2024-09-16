/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodi;

/**
 *
 * @author lenovo
 */
public class FinalProject1 {

static final String DB_URL="jdbc:derby://localhost:1527/OOPFoodiFD";
        static final String USERNAME="APP";
        static final String PASSWORD=" ";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Sign_In signIn= new Sign_In(); //calling the sign in page
       signIn.show();
       Customer authenticUser= signIn.user;//not sure about this!!!!!
      if(authenticUser!=null){
          System.out.println("successfull registration "+ authenticUser.userName);
     }
      else System.out.println("there was a registration error");//both statemen
       
       
    }
    
}
