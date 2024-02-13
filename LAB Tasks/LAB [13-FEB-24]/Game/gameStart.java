import java.lang.*;

public class gameStart{
	public static void main(String[] args){
		System.out.println("\nVALORANT PLAYER 1");
		
		game player1 = new game();
		System.out.println("\nPlayer Details-");
		player1.details();
		
		player1.setName("Siam");
		player1.setId("siam360#1652");
		player1.setResult(65.32); 
		player1.setLevel(28);
		System.out.println("\nLogin Successfull!");
		System.out.println("\nPlayer Details-");
		player1.details();
		
		System.out.println("\nCONGRATULATIONS!");
		System.out.print(player1.getName() + " (" + player1.getId() + ") has been ranked up from " + player1.getLevel() + " to ");
		player1.setLevel(29);
		System.out.println(player1.getLevel());
		
		System.out.println("\nUpdated Player Details-");
		player1.details();
	} 
}