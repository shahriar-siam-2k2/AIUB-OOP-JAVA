import java.lang.*;
import java.util.*;

public class Start {
    public static void main(String[] args){
        String name, phnnb, accnb, acctype;
        double balance;
        int accCount = 0;
        boolean flag;

        Scanner def = new Scanner(System.in);
        Scanner str1 = new Scanner(System.in);
        Scanner str2 = new Scanner(System.in);
        Scanner str3 = new Scanner(System.in);
        Scanner str4 = new Scanner(System.in);

        System.out.println("\n\tWELCOME TO SHAHRIAR BANK LTD.");
        
        System.out.print("\nEnter your name: ");
        name = str1.nextLine();
        System.out.print("Enter your phone number: ");
        phnnb = str2.nextLine();

        User b = new User(name, phnnb, 10);
        
        do{
            System.out.println("\n\tMENU");
            System.out.println("1. Create Account.");
            System.out.println("2. Delete Account.");
            System.out.println("3. View Details.");
            System.out.println("4. Exit.");
            System.out.print("Choose any one: ");
            int option = def.nextInt();

            if(option == 1){
                accCount++;

                System.out.println("\n\tAccount Creation");
                System.out.println("Account-" + accCount);
                System.out.print("Enter account number: ");
                accnb = str3.nextLine();
                System.out.print("Enter account type: ");
                acctype = str4.nextLine();
                System.out.print("Enter account balance: ");
                balance = def.nextDouble();

                Account acc = new Account(accnb, acctype, balance);

                flag = b.createAcc(acc, accCount, accnb);

                if(flag == true){
                    System.out.println("\n\t*Account " + accnb + " Created Successfully!");
                }
                else{
                    System.out.println("\n\t*ACCOUNT CREATION FAILED!");
                    System.out.println("\t*Account Number Should Be Unique!");
                    accCount--;
                }
                
            }
            else if(option == 2){
                if(accCount > 0){
                    System.out.println("\n\tAccount Deletion");
                    System.out.print("Enter the account number you want to delete: ");
                    accnb = str3.nextLine();

                    flag = b.deleteAcc(accnb, accCount);

                    if(flag == true){
                        System.out.println("\n\t*Account " + accnb + " Deleted Successfully!");
                        accCount--;
                    }
                    else{
                        System.out.println("\n\t*ACCOUNT NUMBER NOT FOUND!");
                    }
                }
                else{
                    System.out.println("\n\t*NO ACCOUNT CREATED!");
                }
            }
            else if(option == 3){
                b.details(accCount);
                if(accCount == 0){
                    System.out.println("\n\t*NO ACCOUNT CREATED!");
                }
            }
            else if(option == 4){
                System.out.println("\n\tTHANK YOU");
                break;
            }
            else{
                System.out.println("\n\t*INVALID INPUT!");
            }
        }
        while(true);
    }
}