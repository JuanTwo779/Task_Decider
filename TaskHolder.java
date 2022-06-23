import java.util.ArrayList;

public class TaskHolder
{
    public TaskHolder()
    {
    }

    public ArrayList<Task> taskObjects()
    {
        ArrayList<Task> Tasks = new ArrayList<Task>();

        Task cleanRoom = new Task("Clean Room",
                "Some examples: \n folding clothes, rearranging room, wiping dust, bedsheets",
                60, 20, 40);
        Tasks.add(cleanRoom);

        Task uni = new Task("Uni work",
                "Labs, Lectures, Assessments",
                120, 80, 10);
        Tasks.add(uni);

        Task swe = new Task("Learn new topic",
                "Learn new compsci topic i.e., web dev",
                120, 75, 10);
        Tasks.add(swe);

        Task project = new Task("Project",
                "Continue or begin projects",
                60, 75, 10);

        Task piano = new Task("Piano practice",
                "Finger exercise or Song practice",
                30, 50, 15);
        Tasks.add(piano);

        Task guitar = new Task("Guitar practice",
                "Finger exercise or Song practice",
                30, 50, 15);
        Tasks.add(guitar);

        Task vacuum = new Task("Vacuum rooms",
                "Vacuum room, mummy's room and/or salas mat",
                60, 10, 40);
        Tasks.add(vacuum);

        Task dumbbell = new Task("Exercise - Dumbbells",
                "Bicep curls, shoulder exercises",
                30, 10, 80);
        Tasks.add(dumbbell);

        Task pushUps = new Task("Push ups",
                "Normal, back, chest, triangle, forearms",
                45, 10, 90);
        Tasks.add(pushUps);

        Task legs = new Task("Leg workouts",
                "Squats, lunges, one leg lunges, squat walk, calf raises",
                45, 15, 95);
        Tasks.add(legs);

        Task abs = new Task ("Ab workouts",
                "Russian Twist, Leg raises, Hip raises, Flutter kicks, Plank knee, " +
                        "Chair sit ups, seated in and outs",
                60, 20, 95);
        Tasks.add(abs);

        return Tasks;
    }
}
