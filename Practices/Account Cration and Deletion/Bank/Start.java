import java.lang.*;
import java.util.*;

public class Start {
    public static void main(String[] args){
        String name, phnnb, accnb, acctype;
        double balance;
        int accCount = 0;

        Scanner def = new Scanner(System.in);
        Scanner str1 = new Scanner(System.in);
        Scanner str2 = new Scanner(System.in);
        Scanner str3 = new Scanner(System.in);
        Scanner str4 = new Scanner(System.in);

        System.out.print("\nEnter your name: ");
        name = str1.nextLine();
        System.out.print("Enter your phone number: ");
        phnnb = str2.nextLine();

        Bank b = new Bank();
        b.setName(name);
        b.setPhnNum(phnnb);
        
        do{
            System.out.println("\n\tMENU");
            System.out.println("1. Create Account.");
            System.out.println("2. Delete Account.");
            System.out.println("3. View User Details.");
            System.out.println("4. Exit.");
            System.out.print("Choose any one: ");
            int option = def.nextInt();

            if(option == 1){
                accCount++;

                System.out.println("\nAccount-" + accCount + " Creation");
                System.out.print("Enter acount number: ");
                accnb = str3.nextLine();
                System.out.print("Enter acount type: ");
                acctype = str4.nextLine();
                System.out.print("Enter acount balance: ");
                balance = def.nextDouble();

                Account acc = new Account(accnb, acctype, balance);
                b.createAcc(acc, accCount);
                
            }
            else if(option == 2){
                if(accCount > 0){
                    System.out.print("\nEnter the account number you want to delete: ");
                    accnb = str3.nextLine();

                    if(b.deleteAcc(accnb, accCount) == true){
                        accCount--;
                    }
                }
                else{
                    System.out.println("\n\t*NO ACCOUNT FOUND!");
                }
            }
            else if(option == 3){
                if(accCount > 0){
                    b.details();
                }
                else{
                    System.out.println("\n\t*NO ACCOUNT CREATED!");
                }
            }
            else if(option == 4){
                System.out.println("\n\tTHANK YOU");
                break;
            }
            else{
                System.out.println("\n\t*INVALID IMPUT!");
            }
        }
        while(1==1);
    }
}
