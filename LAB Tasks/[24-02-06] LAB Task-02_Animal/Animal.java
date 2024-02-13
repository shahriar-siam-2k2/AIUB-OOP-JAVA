import java.lang.*;

public class Animal{
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
		Animal a1 = new Animal();
		a1.setName("Royal Bengal Tiger");
		a1.setScName("Panthera tigris");
		a1.setMaxAge(15);
		a1.setBirthPlace("India, Bangladesh, Nepal, Bhutan & Southwestern China.");
		
		Animal a2 = new Animal();
		a2.setName("Elephant");
		a2.setScName("Loxodonta africana");
		a2.setMaxAge(70);
		a2.setBirthPlace("Sub-Saharan Africa, South Asia & Southeast Asia.");
		
		System.out.println("\nUsing details function-");
		
		System.out.println("\nAnimal-1 Details: ");
		a1.details();
		
		System.out.println("\nAnimal-2 Details: ");
		a2.details();
		
		System.out.println("\nUsing getter function-");
		
		System.out.println("\nAnimal-1 Details: ");
		System.out.println("Name: " + a1.getName());
		System.out.println("Scientific Name: " + a1.getScName());
		System.out.println("Maximum Age: " + a1.getMaxAge() + " years");
		System.out.println("Birthplace: " + a1.getBirthPlace());
		
		System.out.println("\nAnimal-2 Details: ");
		System.out.println("Name: " + a2.getName());
		System.out.println("Scientific Name: " + a2.getScName());
		System.out.println("Maximum Age: " + a2.getMaxAge() + " years");
		System.out.println("Birthplace: " + a2.getBirthPlace());
	}
}