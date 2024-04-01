import java.lang.*;
import java.util.*;

public class Start {
    public static void main(String[] args){
        String name, email, id, number, toNum, toName;
        double balance;
        int min;

        Scanner def = new Scanner(System.in);
        Scanner str1 = new Scanner(System.in);
        Scanner str2 = new Scanner(System.in);
        Scanner str3 = new Scanner(System.in);
        Scanner str4 = new Scanner(System.in);
        Scanner str5 = new Scanner(System.in);
        Scanner str6 = new Scanner(System.in);

        Call obj[] = new Call[2];

        for(int i=0 ; i<obj.length ; i++){
            System.out.println("\nPerson-" + (i+1));

            System.out.print("Enter Name: ");
            name = str1.nextLine();

            System.out.print("Enter Email: ");
            email = str2.nextLine();

            System.out.print("Enter ID: ");
            id = str3.nextLine();

            System.out.print("Enter Phone Number: ");
            number = str4.nextLine();

            System.out.print("Enter Balance: ");
            balance = def.nextDouble();

            System.out.print("Enter To Number: ");
            toNum = str5.nextLine();

            System.out.print("Enter To Name: ");
            toName = str6.nextLine();

            System.out.print("Enter Talktime: ");
            min = def.nextInt();

            if(obj[i] == null){
                obj[i] = new Call(name, email, id, number, balance, toNum, toName, min);
            }
        }

        for(int i=0 ; i<obj.length ; i++){
            System.out.println("\nPerson-" + (i+1) + " Details: ");
            obj[i].ViewDetails();
        }
    }
}