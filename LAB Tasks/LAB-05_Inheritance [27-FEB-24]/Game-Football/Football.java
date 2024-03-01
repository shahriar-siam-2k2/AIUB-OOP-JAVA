import java.lang.*;

public class Football extends Game {
	
	private String stadium;
	
	public Football(){
		System.out.println("\nEmpty constructor of Football");
	}
	public Football(String name, String id, double score, String stadium){
		super(name, id, score);
		this.stadium = stadium;
		System.out.println("\nParameterized constructor of Football");
	}
	
	public void setStadium(String stadium){
		this.stadium = stadium;
	}
	
	public String getStadium(){
		return stadium;
	}
	
	public void Details(){
		super.Details();
		System.out.println("Stadium: " + stadium);
	}
}