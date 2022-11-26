import java.util.ArrayList;
import java.util.List;

public class UserInterface
{

    private List<Task> tasks;
    private Input objInput = new Input();
    private Task newTask;

    public UserInterface()
    {
        tasks = new ArrayList<>();
    }

    //Decide
    //ask user for spare time, mental and physical capacity
    private int time()
    {
        int taskTime = 0;
        taskTime = objInput.acceptIntInput("How much time do you have? (In hours)");
        return taskTime;
    }

    private int mentalCap()
    {
        int mentalCap = 0;
        mentalCap = objInput.acceptIntInput("What is your current mental capacity? (1 - 100)");
        return mentalCap;
    }

    private int physicalCap()
    {
        int physicalCap = 0;
        physicalCap = objInput.acceptIntInput("What is your current physical capacity? (1 - 100)");
        return physicalCap;
    }

    //Add new task
    private void addTask(){
        String name = "";
        String desc = "";
        Integer time = 0;
        Integer mental = 0;
        Integer physical = 0;

        name = objInput.acceptStringInput("Enter to the name of the new task!");
        desc = objInput.acceptStringInput("Enter a short description of the new task");
        time = objInput.acceptIntInput("How long (hours) does it take to complete new task");
        mental = objInput.acceptIntInput("Enter the mental capacity needed for the new task");
        physical = objInput.acceptIntInput("Enter the physical capacity needed for the new task");

        newTask = new Task(name, desc, time, mental, physical);
        tasks.add(newTask);
    }
}
