import java.lang.*;

public class Flower{
	private String name;
	private String scName;
	private int maxAge;
	private String birthPlace;
	
	public Flower(){
		System.out.println("\nDefault Constructor.");
	}
	
	public Flower(String name, String scName, int maxAge, String birthPlace){
		this.name = name;
		this.scName = scName;
		this.maxAge = maxAge;
		this.birthPlace = birthPlace;
		System.out.println("\nParameterized Constructor.");
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void setScName(String scName){
		this.scName = scName;
	}
	public void setMaxAge(int maxAge){
		this.maxAge = maxAge;
	}
	public void setBirthPlace(String birthPlace){
		this.birthPlace = birthPlace;
	}
	
	public String getName(){
		return name;
	}
	public String getScName(){
		return scName;
	}
	public int getMaxAge(){
		return maxAge;
	}
	public String getBirthPlace(){
		return birthPlace;
	}
	
	public void details(){
		System.out.println("Name: " + name);
		System.out.println("Scientific Name: " + scName);
		System.out.println("Maximum Age: " + maxAge + " years");
		System.out.println("Birthplace: " + birthPlace);
	}
	
	public static void main(String[] args){
		Flower f1 = new Flower("Royal Bengal Tiger", "Panthera tigris", 15, "India, Bangladesh, Nepal, Bhutan & Southwestern China.");
		System.out.println("\nFlower-01");
		f1.details();
		
		Flower f2 = new Flower();
		System.out.println();
		f2.details();
		
		Flower f3 = new Flower("Elephant", "Loxodonta africana", 70, "Sub-Saharan Africa, South Asia & Southeast Asia.");
		System.out.println("\nFlower-02");
		f3.details();
	}
}