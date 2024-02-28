import java.lang.*;

public class Person{
	private String name;
	private String id;
	private int age;
	
	public Person(){
		System.out.println("\nNO DATA FOUND (Empty Constructor Called!)");
	}
	public Person(String name, String id, int age){
		this.name = name;
		this.id = id;
		this.age = age;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void setId(String id){
		this.id = id;
	}
	public void setAge(int age){
		this.age = age;
	}
	
	public String getName(){
		return name;
	}
	public String getId(){
		return id;
	}
	public int getAge(){
		return age;
	}
	
	public void Details(){
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("Age: " + age);
	}
}