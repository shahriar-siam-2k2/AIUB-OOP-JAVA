import java.lang.*;

public class Car {
    private Customer cus;
    private String name;
    private String color;
    private double price;

    public Car(){
        System.out.println("\t*Called Empty constructor of Car");
    }
    public Car(Customer cus, String name, String color, double price){
        this.cus = cus;
        this.name = name;
        this.color = color;
        this.price = price;
        System.out.println("\t*Called Para constructor of Car");
    }

    public void setCustomer(Customer cus){this.cus = cus;}
    public void setName(String name){this.name = name;}
    public void setColor(String color){this.color = color;}
    public void setPrice(double price){this.price = price;}

    public Customer getCustomer(){return cus;}
    public String getName(){return name;}
    public String getColor(){return color;}
    public double getPrice(){return price;}

    public void details(){
        cus.details();
        System.out.println("Car Name: " + name);
        System.out.println("Car Color: " + color);
        System.out.println("Car Price: " + price + " Taka");
    }
}