import java.lang.*;
import java.util.*;

public class Start{
	public static void main(String[] args){
		Scanner sc1 = new Scanner(System.in);
		System.out.print("\nEnter Name: ");
		String nm = sc1.nextLine();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.print("Enter ID: ");
		String ID = sc1.nextLine();
		
		System.out.print("Enter Age: ");
		int ag = sc1.nextInt();
		
		Person p1 = new Person(nm, ID, ag);
		System.out.println("\nPerson-1 Details: ");
		p1.Details();
		
		Person p2 = new Person();
		System.out.println("\nPerson-2 Details: ");
		p2.Details();
	}
}