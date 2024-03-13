import java.lang.*;

public class Call extends Phone {
    private String toNum;
    private int min;

    public Call(){}
    public Call(String name, String email, String number, double balance, String toNum, int min){
        super(name, email, number, balance);
        this.toNum = toNum;
        this.min = min;
    }

    public void setToNum(String toNum){this.toNum = toNum;}
    public void setMin(int min){this.min = min;}

    public String getToNum(){return toNum;}
    public int getMin(){return min;}

    public double getCost(){
        double cost = 0.25 * min;
        return cost;
    }
    public double updatedBalance(){
        double balance = super.getBalance();
        double updated = balance - getCost();
        super.setBalance(updated);
        return updated;
    }

    public void ViewDetails(){
        super.VeiwDetails();
        System.out.println("\nOutgoing Number: " + toNum + "\nTalktime: " + min + " minutes" + "\nTotal Cost: " + getCost() + " Taka" + "\nNew Balance: " + updatedBalance() + " Taka");
    }
}