import java.lang.*;

public class Programmer {
    private String Name;
    private String Email;
    private double salary;

    public Programmer(){}
    public Programmer(String Name, String Email, double salary){
        this.Name = Name;
        this.Email = Email;
        this.salary = salary;
    }
    
    public void setName(String Name){
        this.Name = Name;
    }
    public void setEmail(String Email){
        this.Email = Email;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    
    public String getName(){
        return Name;
    }
    public String getEmail(){
        return Email;
    }
    public double getSalary(){
        return salary;
    }
    public double getYearlySalary(){
        double ySal = 12 * salary;
        return ySal;
    }

    public void ViewDetails(){
        System.out.println("Name: " + Name);
        System.out.println("Email: " + Email);
        System.out.println("Salary: " + salary);
        System.out.print("Yearly Salary: ");
        getYearlySalary();
    }
}