import java.lang.*;

public class Flower{
	private String name;
	private String scName;
	private int maxAge;
	private String birthPlace;
	
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
		Flower f1 = new Flower();
		f1.setName("Water Lily");
		f1.setScName("Nymphaeaceae");
		f1.setMaxAge(10);
		f1.setBirthPlace("Kew Gardens in London");
		
		Flower f2 = new Flower();
		f2.setName("Rose");
		f2.setScName("Rosa rubiginosa");
		f2.setMaxAge(7);
		f2.setBirthPlace("China");
		
		System.out.println("\nUsing details function-");
		
		System.out.println("\nFlower-1 Details: ");
		f1.details();
		
		System.out.println("\nFlower-2 Details: ");
		f2.details();
		
		System.out.println("\nUsing getter function-");
		
		System.out.println("\nFlower-1 Details: ");
		System.out.println("Name: " + f1.getName());
		System.out.println("Scientific Name: " + f1.getScName());
		System.out.println("Maximum Age: " + f1.getMaxAge() + " years");
		System.out.println("Birthplace: " + f1.getBirthPlace());
		
		System.out.println("\nFlower-2 Details: ");
		System.out.println("Name: " + f2.getName());
		System.out.println("Scientific Name: " + f2.getScName());
		System.out.println("Maximum Age: " + f2.getMaxAge() + " years");
		System.out.println("Birthplace: " + f2.getBirthPlace());
	}
}