import java.lang.*;

public class Game {
	private String name;
	private String id;
	private double score;
	
	public Game(){
		System.out.println("\nEmpty constructor of Game");
	}
	public Game(String name, String id, double score){
		this.name = name;
		this.id = id;
		this.score = score;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void setId(String id){
		this.id = id;
	}
	public void setScore(double score){
		this.score = score;
	}
	
	public String getName(){
		return name;
	}
	public String getId(){
		return id;
	}
	public double getScore(){
		return score;
	}
	
	public void Details(){
		System.out.println("\nName: " + name);
		System.out.println("ID: " + id);
		System.out.println("Score: " + score);
	}
}