package foodi;


public class Admin extends Account {
    
    public static int numOfAdmins;
    
    public Admin( String userName, String password, String location,String phoneNumber ){
    
        super(userName,password,location,phoneNumber);
        numOfAdmins++;
    }
    
    
}
