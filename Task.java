public class Task
{
    private String title;
    private int taskTime;
    private int taskWork;


    public Task()
    {
        title = "unknown";
        taskTime = 0;
        taskWork = 0;
    }

    public Task(String title, int taskTime, int taskWork)
    {
        this.title = title;
        this.taskTime = taskTime;
        this.taskWork = taskWork;
    }

    public void setTaskTime(int taskTime) {
        this.taskTime = taskTime;
    }

    public void setTaskWork(int taskWork){
        this.taskWork = taskWork;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public int getTaskTime()
    {
        return this.taskTime;
    }

    public int getTaskWork()
    {
        return this.taskWork;
    }

    public String getTitle()
    {
        return this.title;
    }

    public String display()
    {
        return "Task name: " + title + "\nWork required: " + taskWork +
                "\nTime required for completion: " + taskTime;
    }

}
