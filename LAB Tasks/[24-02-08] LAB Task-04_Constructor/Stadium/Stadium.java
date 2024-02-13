import java.lang.*;

public class Stadium {
	private String name;
	private String id;
	private int capacity;
	private String country;
	
	public Stadium(){
		System.out.println("\nDefault Constructor.");
	}
	
	public Stadium(String name, String id, int capacity, String country){
		this.name = name;
		this.id = id;
		this.capacity = capacity;
		this.country = country;
		System.out.println("\nParameterized Constructor.");
	}
	
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
		Stadium s1 = new Stadium("Shahriar International Stadium", "23-53004-3", 5000, "Bangladesh");
		System.out.println("\nStadium-01");
		s1.details();
		
		Stadium s2 = new Stadium();
		System.out.println();
		s2.details();
		
		Stadium s3 = new Stadium("Indira Gandhi Memorial Stadium", "6464654-51561411-44", 100000, "India");
		System.out.println("\nStadium-02");
		s3.details();
	}
}