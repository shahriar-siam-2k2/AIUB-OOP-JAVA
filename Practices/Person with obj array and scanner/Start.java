import java.lang.*;
import java.util.*;

public class Start{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String nm, id;
		int size, ag;
		
		System.out.print("\nEnter person count: ");
		size = sc.nextInt();
		
		Person per[] = new Person [size];
		Scanner str[] = new Scanner(System.in) [size];
		
		for(int i=0 ; i<size ; i++){
			System.out.println("\nPerson-" + (i+1) + " Information setting-");
			
			if(str[i] == null){
				System.out.print("Enter Name: ");
				nm = str[i].nextLine();
				System.out.print("Enter ID: ");
				id = str[i].nextLine();
			}
			System.out.print("Enter Age: ");
			ag = sc.nextInt();
			
			if(per[i] == null){
				per[i] = new Person(nm, id, ag);
			}
		}
		System.out.println("\nAll person details-");
		for(int i=0 ; i<size ; i++){
			System.out.println("\nPerson-" + (i+1) + ":");
			per[i].Details();
		}
	}
}