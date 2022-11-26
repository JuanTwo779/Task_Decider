public class Task
{
    private String title;
    private String desc;
    private int taskTime;
    private int mentalCap;
    private int physicalCap;
    //mental and physical capacity to complete tasks


    public Task()
    {
        title = "unknown";
        desc = "unknown";
        taskTime = 0;
        mentalCap = 0;
        physicalCap = 0;
    }

    public Task(String title, String desc, int taskTime, int mentalCap, int physicalCap)
    {
        this.title = title;
        this.desc = desc;
        this.taskTime = taskTime;
        this.mentalCap = mentalCap;
        this.physicalCap = physicalCap;
    }

    public void setDesc(String desc)
    {
        this.desc = desc;
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

    public String getDesc()
    {
        return this.desc;
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

//    public String display()
//    {
//        return "Task name: " + title +
//                "\nTask description: " + desc +
//                "\nMental capacity required: " + mentalCap +
//                "\nPhysical capacity required: " + physicalCap +
//                "\nTime required for completion: " + taskTime;
//    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", taskTime=" + taskTime +
                ", mentalCap=" + mentalCap +
                ", physicalCap=" + physicalCap +
                '}';
    }
}
