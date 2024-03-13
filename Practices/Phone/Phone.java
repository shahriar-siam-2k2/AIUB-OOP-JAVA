import java.lang.*;

public class Phone {
    private String name;
    private String email;
    private String number;
    private double balance;

    public Phone(){}
    public Phone(String name, String email, String number, double balance){
        this.name = name;
        this.email = email;
        this.number = number;
        this.balance = balance;
    }
    
    public void setName(String name){this.name = name;}
    public void setEmail(String email){this.email = email;}
    public void setNumber(String number){this.number = number;}
    public void setBalance(double balance){this.balance = balance;}

    public String getName(){return name;}
    public String getEmail(){return email;}
    public String getNumber(){return number;}
    public double getBalance(){return balance;}

    public void VeiwDetails(){
        System.out.println("\nName: " + name + "\nEmail: " + email + "\nPhone Number: " + number + "\nBalance: " + balance);
    }
}