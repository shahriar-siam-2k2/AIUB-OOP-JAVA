import java.lang.*;
import java.util.*;

public class StartProgrammer{
    public static void main(String[] args){
        Scanner def = new Scanner(System.in);
        Scanner str1 = new Scanner(System.in);
        Scanner str2 = new Scanner(System.in);
        Scanner str3 = new Scanner(System.in);
        Scanner str4 = new Scanner(System.in);
        Scanner str5 = new Scanner(System.in);
    
        FrontendDeveloper obj[] = new FrontendDeveloper[2];
    
        String name, email, id, assign, complete;
        double sal;
        
        for(int i=0 ; i<obj.length ; i++){
            System.out.println("\nDeveloper-" + (i+1) + ":");
    
            System.out.print("Enter Name: "); 
            name = str1.nextLine();
    
            System.out.print("Enter Email: ");
            email = str2.nextLine();
    
            System.out.print("Enter Salary: ");
            sal = def.nextDouble();
    
            System.out.print("Enter ID: ");
            id = str3.nextLine();
    
            System.out.print("Enter Assigned Task: ");
            assign = str4.nextLine();
    
            System.out.print("Enter Completed Task: ");
            complete = str5.nextLine();
    
            if(obj[i] == null){
                obj[i] = new FrontendDeveloper(name, email, sal, id, assign, complete);
            }
        }
    
        System.out.println("\nDeveloper Details-");
        for(int i=0 ; i<obj.length ; i++){
            System.out.println("\nDeveloper-" + (i+1));
            obj[i].ViewDetails();
        }
    }
}