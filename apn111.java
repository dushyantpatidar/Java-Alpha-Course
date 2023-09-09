class BankAccount{
    public String username ;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}
public class apn111 {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Dushyant_patidar";
        //myAcc.password = "adcdef"; // Cause error bcz password is Private 
        myAcc.setPassword("asdvferfve");
    }
}
