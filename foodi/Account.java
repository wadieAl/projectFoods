package foodi;


public class Account {
    
    //attributes
    
    protected String userName;
    protected String password;
    protected String location;
    protected String phoneNumber;
    
    //empty constructor
    public Account(){};
     
    //constructor
    public Account( String userName, String password, String location,String phoneNumber ){
        
        this.userName= userName;
        this.password= password;
        this.location= location;
        this.phoneNumber=phoneNumber;
    }
    
    
    
    //the attributes are gonna be sent from the whole GUI made where it is connected to the DB
    
   
    
}
