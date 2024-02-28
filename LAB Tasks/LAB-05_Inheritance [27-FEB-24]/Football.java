import java.lang.*;

public class Football extends Game {
	
	private String stadium;
	
	public Football(){
		System.out.println("\nEmpty constructor of Football");
	}
	public Football(String name, String id, double score, String stadium){
		super(name, id, score);
		this.stadium = stadium;
	}
	
	public void setStadium(String stadium){
		this.stadium = stadium;
	}
	
	public String getStadium(){
		return stadium;
	}
	
	public void Details(){
		System.out.println("\nStadium: " + stadium);
	}
}