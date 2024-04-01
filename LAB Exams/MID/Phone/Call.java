import java.lang.*;

public class Call extends Phone {
    private String toNum;
    private String toName;
    private int talktime;

    public Call(){}
    public Call(String name, String email, String id, String number, double balance, String toNum, String toName, int talktime){
        super(name, email, id, number, balance);
        this.toNum = toNum;
        this.toName = toName;
        this.talktime = talktime;
    }

    public void setToNum(String toNum){this.toNum = toNum;}
    public void setToName(String toName){this.toName = toName;}
    public void setTalktime(int talktime){this.talktime = talktime;}

    public String getToNum(){return toNum;}
    public String getToName(){return toName;}
    public int getTalktime(){return talktime;}

    public double getCost(){
        double cost = 0.25 * talktime;
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
        System.out.println("\nOutgoing Number: " + toNum + "\nOutgoing Name: " + toName + "\nTalktime: " + talktime + " minutes" + "\nTotal Cost: " + getCost() + " Taka" + "\nNew Balance: " + updatedBalance() + " Taka");
    }
}