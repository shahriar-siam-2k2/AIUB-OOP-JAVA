import java.lang.*;

public class Phone {
    private String name;
    private String email;
    private String id;
    private String number;
    private double balance;

    public Phone(){}
    public Phone(String name, String email, String id, String number, double balance){
        this.name = name;
        this.email = email;
        this.id = id;
        this.number = number;
        this.balance = balance;
    }

    public void setName(String name){this.name = name;}
    public void setEmail(String email){this.email = email;}
    public void setId(String id){this.id = id;}
    public void setNumber(String number){this.number = number;}
    public void setBalance(double balance){this.balance = balance;}

    public String getName(){return name;}
    public String getEmail(){return email;}
    public String getId(){return id;}
    public String getNumber(){return number;}
    public double getBalance(){return balance;}

    public void VeiwDetails(){
        System.out.println("\nName: " + name + "\nEmail: " + email + "\nID: " + id + "\nPhone Number: " + number + "\nBalance: " + balance);
    }
}