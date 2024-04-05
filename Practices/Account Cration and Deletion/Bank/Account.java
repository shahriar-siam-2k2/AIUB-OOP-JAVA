import java.lang.*;

public class Account {
    private String accnb;
    private String type;
    private double balance;

    public Account(){}
    public Account(String accnb, String type, double balance){
        this.accnb = accnb;
        this.type = type;
        this.balance = balance;
    }

    public void setAccnb(String accnb){this.accnb = accnb;}
    public void setAccType(String type){this.type = type;}
    public void setBalance(double balance){this.balance = balance;}

    public String getAccnb(){return accnb;}
    public String getAccType(){return type;}
    public double getBalance(){return balance;}

    
    public void details(){
        System.out.println("Account number: " + accnb);
        System.out.println("Account Type: " + type);
        System.out.println("Balance: " + balance + " BDT" + "\n");
    }
}