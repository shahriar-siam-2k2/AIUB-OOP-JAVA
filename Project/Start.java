import java.lang.*;

public class Start 
{
	public static void main(String[]args)
	{
		PetShop splash = new PetShop();
		splash.setVisible(true);
		try{
		Thread.sleep(3000);
		splash.dispose();
		
	}
	catch(Exception e)
    {
		e.printStackTrace();
	}		
	}
}