public class Task
{
    private String title;
    private int taskTime;
    private int mentalCap;
    private int physicalCap;
    //mental and physical capacity to complete tasks


    public Task()
    {
        title = "unknown";
        taskTime = 0;
        mentalCap = 0;
        physicalCap = 0;
    }

    public Task(String title, int taskTime, int mentalCap, int physicalCap)
    {
        this.title = title;
        this.taskTime = taskTime;
        this.mentalCap = mentalCap;
        this.physicalCap = physicalCap;
    }

    public void setTaskWork(int taskWork){
        this.mentalCap = taskWork;
    }

    public void setTaskTime(int taskTime) {
        this.taskTime = taskTime;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public int getMentalCap()
    {
        return this.mentalCap;
    }

    public int getTaskTime()
    {
        return this.taskTime;
    }

    public String getTitle()
    {
        return this.title;
    }

    public String display()
    {
        return "Task name: " + title +
                "\nMental capacity required: " + mentalCap +
                "\nPhysical capcity required: " + physicalCap +
                "\nTime required for completion: " + taskTime;
    }

}
