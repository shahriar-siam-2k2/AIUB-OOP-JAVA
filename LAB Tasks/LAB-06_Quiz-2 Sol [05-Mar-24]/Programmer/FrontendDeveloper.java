import java.lang.*;

public class FrontendDeveloper extends Programmer {
    private String assignTask;
    private String completeTask;
    private String Id;

    public FrontendDeveloper(){}
    public FrontendDeveloper(String Name, String Email, double salary, String Id, String assignTask, String completeTask){
        super(Name, Email, salary);
        this.assignTask = assignTask;
        this.completeTask = completeTask;
        this.Id = Id;
    }

    public void setId(String Id){
        this.Id = Id;
    }
    public void setAssignTask(String assignTask){
        this.assignTask = assignTask;
    }
    public void setCompleteTask(String completeTask){
        this.completeTask = completeTask;
    }

    public String getId(){
        return Id;
    }
    public String getAssignTask(){
        return assignTask;
    }
    public String getCompleteTask(){
        return completeTask;
    }

    public void ViewDetails(){
        super.ViewDetails();
        System.out.println("ID: " + Id);
        System.out.println("Assigned Task: " + assignTask);
        System.out.println("Completed Task: " + completeTask);
    }
}