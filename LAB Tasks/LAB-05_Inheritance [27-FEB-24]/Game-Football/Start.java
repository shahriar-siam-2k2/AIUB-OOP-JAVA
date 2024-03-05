import java.lang.*;
import java.util.*;

public class Start{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int player, op;
		double score;
		String name, id, stadium;
		
		System.out.print("\nEnter player count: ");
		player = sc.nextInt();
		
		System.out.print("\n1. Create account." + "\n2. Don't Create account." + "\nChoose your option (1/2): ");
		op = sc.nextInt();
		
		Football gm[] = new Football [player];
		
		if(op == 1){
			for(int i=0 ; i<player ; i++){
				System.out.println("\nEnter Player-" + (i+1) + " Information-");
				System.out.print("Enter Name: ");
				Scanner sc1 = new Scanner(System.in);
				name = sc1.nextLine();
				System.out.print("Enter ID: ");
				Scanner sc2 = new Scanner(System.in);
				id = sc2.nextLine();
				System.out.print("Enter Score: ");
				score = sc.nextDouble();
				System.out.print("Enter Stadium: ");
				Scanner sc3 = new Scanner(System.in);
				stadium = sc3.nextLine();
				
				if(gm[i] == null){
					gm[i] = new Football(name, id, score, stadium);
				}
			}
		}
		else{
			for(int i=0 ; i<player ; i++){
				if(gm[i] == null){
					gm[i] = new Football();
				}
			}
		}
		
		System.out.println("\n-------------------------------------------");
		System.out.println("\nFootball player informations-\n");
		for(int i=0 ; i<player ; i++){
			System.out.println("Player-" + (i+1) + ":");
			gm[i].Details();
			System.out.print("\n");
		}
	}
}