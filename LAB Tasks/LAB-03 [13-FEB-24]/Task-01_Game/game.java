import java.lang.*;

public class game{
	private String name;
	private String id;
	private double result;
	private static int level;
	
	public game(){
		System.out.println("\nUnseccesfull Login (Empty constructor)");
	}
	public game(String name, String id, double result, int level){
		this.name = name;
		this.id = id;
		this.result = result;
		this.level = level;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void setId(String id){
		this.id = id;
	}
	public void setResult(double result){
		this.result = result;
	}
	public void setLevel(int level){
		this.level = level;
	}
	
	public String getName(){
		return name;
	}
	public String getId(){
		return id;
	}
	public double getResult(){
		return result;
	}
	public int getLevel(){
		return level;
	}
	
	public void details(){
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("Result: " + result);
		System.out.println("Level: " + level);
	}
}