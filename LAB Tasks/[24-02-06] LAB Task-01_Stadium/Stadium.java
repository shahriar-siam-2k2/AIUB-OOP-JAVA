import java.lang.*;

public class Stadium {
	private String name;
	private String id;
	private int capacity;
	private String country;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public int getCapacity() {
		return capacity;
	}
	public String getCountry() {
		return country;
	}
	
	public void details(){
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("Capacity: " + capacity);
		System.out.println("Country: " + country);
	}
	
	public static void main(String[] args){
		System.out.println("\nTwo Stadiums-");
		
		Stadium s1 = new Stadium();
		s1.setName("Shahriar International Stadium");
		s1.setId("23-53004-3");
		s1.setCapacity(5000);
		s1.setCountry("Bangladesh");
		
		Stadium s2 = new Stadium();
		s2.setName("Indira Gandhi Memorial Stadium");
		s2.setId("6464654-51561411-44");
		s2.setCapacity(100000);
		s2.setCountry("India");
		
		System.out.println("\nStadium-1 Details: ");
		s1.details();
		System.out.println("\nStadium-2 Details: ");
		s2.details();
	}
}