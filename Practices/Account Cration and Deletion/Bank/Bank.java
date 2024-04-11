import java.lang.*;

public class Bank {
    private String name;
    private String phnnb;
    private Account acc[];
    private int accCount;

    public Bank(){}
<<<<<<< Updated upstream
    public Bank(String name, String phnnb, int accCount){
=======
    public Bank(String name, String phnnb, Account acc, int accCount){
>>>>>>> Stashed changes
        this.name = name;
        this.phnnb = phnnb;
        this.accCount = accCount;
        this.acc = new Account [accCount];
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

    public boolean createAcc(Account accLocation, int accCount, String accnb){
        if(accCount >= acc.length){
            Account[] newAcc = new Account[acc.length * 2];
            for(int i=0 ; i<acc.length ; i++){
                newAcc[i] = acc[i];
            }
            acc = newAcc;
        }

        boolean flag = false;
        for(int i=0 ; i<acc.length ; i++){
            boolean check = false;
            for(int j=0 ; j<acc.length ; j++){
                if(acc[j] != null && acc[j].getAccnb().equals(accnb)){
                    check = true;
                    break;
                }
            }
            if(acc[i] == null && check == false){
                acc[i] = accLocation;
                flag = true;
                break; 
            }
        }
        return flag;
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
        return flag;
    }

    public void details(int accCount){
        int c=1;
        System.out.println("\n\tUser Details");
        System.out.println("User Name: " + name);
        System.out.println("User Phone number: " + phnnb);
        System.out.println("Total Accounts: " + accCount);
        System.out.println("\n\tUser Account Details");
        for(int i=0 ; i<acc.length ; i++){
            if(acc[i] != null){
                System.out.println("Account-" + c);
                acc[i].details();
                c++;
            }
        }
    }
}