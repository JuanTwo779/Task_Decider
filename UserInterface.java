public class UserInterface
{
    public UserInterface()
    {
    }

    //ask user for spare time, mental and physical capacity

    public int time()
    {
        Input objInput = new Input();
        int taskTime = 0;
        taskTime = objInput.acceptIntInput("How much time do you have? (In hours)");
        return taskTime;
    }

    public int mentalCap()
    {
        Input objInput = new Input();
        int mentalCap = 0;
        mentalCap = objInput.acceptIntInput("What is your current mental capacity? (1 - 100)");
        return mentalCap;
    }

    public int physicalCap()
    {
        Input objInput = new Input();
        int physicalCap = 0;
        physicalCap = objInput.acceptIntInput("What is your current physical capacity? (1 - 100)");
        return physicalCap;
    }
}
