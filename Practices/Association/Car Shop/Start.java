import java.lang.*;
import java.util.*;

public class Start {
    public static void main(String[] args){
        String custname, phnNum, carname, color;
        double price;
        int age, custCount;

        Scanner def = new Scanner(System.in);
        Scanner str1 = new Scanner(System.in);
        Scanner str2 = new Scanner(System.in);
        Scanner str3 = new Scanner(System.in);
        Scanner str4 = new Scanner(System.in);

        System.out.print("\nEnter total customers: ");
        custCount = def.nextInt();

        Customer cus[] = new Customer[custCount];
        Car cars[] = new Car[custCount];

        for(int i=0 ; i<custCount ; i++){
            System.out.println("\nEnter Customer-" + (i+1) + " Details:");
            System.out.print("Customer Name: ");
            custname = str1.nextLine();

            System.out.print("Customer Phone Number: ");
            phnNum = str2.nextLine();

            System.out.print("Customer Age: ");
            age = def.nextInt();

            if(cus[i] == null){
                cus[i] = new Customer(custname, phnNum, age);
            }


            System.out.print("Car Name: ");
            carname = str3.nextLine();

            System.out.print("Car Color: ");
            color = str4.nextLine();

            System.out.print("Car Price: ");
            price = def.nextDouble();
            
            if(cars[i] == null){
                cars[i] = new Car(cus[i], carname, color, price);
            }
        }

        System.out.println("\nReceipt-");
        for(int i=0 ; i<custCount ; i++){
            System.out.println("\nCustomer-" + (i+1) + ":");
            cars[i].details();
        }
    }
}