package foodi;

//most of the subclasses are done in a simple way, most of the work is handeled in the GUI and probably the account superclass 
//im probably gonna ask you guys to manage the errors and the error handling

public class Customer extends Account{
    
    public static int numOfCustomers;
    
    public Customer(String userName, String password, String location,String phoneNumber ){
    
        super(userName,password,location,phoneNumber);
        numOfCustomers++;
    }
    
    public Customer(){};
}
