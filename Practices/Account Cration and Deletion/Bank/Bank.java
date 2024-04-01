import java.lang.*;

public class Bank {
    private String name;
    private String phnnb;
    private Account acc[];
    private int accCount;

    public Bank(){
        System.out.println("\t*Empty Constructor Called!");
    }
    public Bank(String name, String phnnb, Account acc, int accCount){
        this.name = name;
        this.phnnb = phnnb;
        this.acc = new Account [accCount];
        System.out.println("\t*Para Constructor Called!");
    }

    public void setName(String name){this.name = name;}
    public void setPhnNum(String phnnb){this.phnnb = phnnb;}
    public void setAcc(Account acc, int accCount){
        this.accCount = accCount;
        this.acc = new Account [accCount];
    }

    public String getName(){return name;}
    public String getPhnNum(){return phnnb;}
    public Account[] getAcc(){return acc;}

    public void createAcc(Account accno, int accCount){
        boolean flag = false;
        for(int i=0 ; i<acc.length ; i++){
            if(acc[i] == null){
                acc[i] = accno;
                flag = true;
                break;
            }
        }
        if(flag == true){
            System.out.println("\t*Account-" + accCount + " Created Successfully!");
        }
    }
    public boolean deleteAcc(String accnb, int accCount){
        boolean flag = false;
        for(int i=0 ; i<acc.length ; i++){
            if(acc[i] != null && acc[i].getAccnb().equals(accnb)){
                acc[i] = null;
                flag = true;
                break;
            }
        }
        if(flag == true){
            System.out.println("\t*Account-" + accCount + " Deleted Successfully!");
        }
        else{
            System.out.println("\t*ACCOUNT NUMBER NOT FOUND!");
        }
        return flag;
    }

    public void details(){
        System.out.println("\nUser Details-");
        System.out.println("User Name: " + name);
        System.out.println("User Phone number: " + phnnb + "\n");
        for(int i=0 ; i<acc.length ; i++){
            if(acc[i] != null){
                int c=1;
                System.out.println("Account-" + c);
                acc[i].details();
                c++;
            }
        }
    }
}