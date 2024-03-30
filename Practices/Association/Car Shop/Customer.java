import java.lang.*;

public class Customer {
    private String custName;
    private String phnNum;
    private int age;

    public Customer(){
        System.out.println("\t*Called Empty constructor of Customer");
    }
    public Customer(String custName, String phnNum, int age){
        this.custName = custName;
        this.phnNum = phnNum;
        this.age = age;
        System.out.println("\t*Called Para constructor of Customer");
    }

    public void setCustName(String custName){this.custName = custName;}
    public void setPhnNum(String phnNum){this.phnNum = phnNum;}
    public void setAge(int age){this.age = age;}

    public String getCustName(){return custName;}
    public String getPhnNum(){return phnNum;}
    public int getAge(){return age;}

    public void details(){
        System.out.println("Customer Name: " + custName);
        System.out.println("Customer Phone Number: " + phnNum);
        System.out.println("Customer Age: " + age);
    }
}