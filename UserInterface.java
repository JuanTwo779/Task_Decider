import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class UserInterface
{

    private List<Task> tasks;
    private Input objInput = new Input();
    private Task newTask;

    public UserInterface()
    {
        tasks = new ArrayList<>();
    }

    //1. Decide which task
    //Get time
    private int time()
    {
        int taskTime = 0;
        taskTime = objInput.acceptIntInput("How much time do you have? (In hours)");
        return taskTime;
    }

    private Supplier<Integer> getUserTime = () ->
            objInput.acceptIntInput("What is your current physical capacity? (1 - 100)");

    //Get Mental
    private int mentalCap()
    {
        int mentalCap = 0;
        mentalCap = objInput.acceptIntInput("What is your current mental capacity? (1 - 100)");
        return mentalCap;
    }

    private Supplier<Integer> getUserMental = () ->
            objInput.acceptIntInput("What is your current physical capacity? (1 - 100)");

    //Get physical
    private int physicalCap()
    {
        int physicalCap = 0;
        physicalCap = objInput.acceptIntInput("What is your current physical capacity? (1 - 100)");
        return physicalCap;
    }

    private Supplier<Integer> getUserPhysical = () ->
            objInput.acceptIntInput("What is your current physical capacity? (1 - 100)");



    //2. Add new task
    private void addTask(){
        String name, desc = "";
        Integer time, mental, physical = 0;

        name = objInput.acceptStringInput("Enter to the name of the new task!");
        desc = objInput.acceptStringInput("Enter a short description of the new task");
        time = objInput.acceptIntInput("How long (hours) does it take to complete new task");
        mental = objInput.acceptIntInput("Enter the mental capacity needed for the new task");
        physical = objInput.acceptIntInput("Enter the physical capacity needed for the new task");

        newTask = new Task(name, desc, time, mental, physical);
        tasks.add(newTask);
    }


    //3. Display list
}
