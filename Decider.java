import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Decider
{
    public static void main(String[] args)
    {
        welcome();
    }

    public static void welcome()
    {
        System.out.println("______________________________________");
        System.out.println("Welcome back lazy head");
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm");
        LocalDateTime current = LocalDateTime.now();
        System.out.println("The current date is: " + dateFormat.format(current));
        System.out.println("The current time is: " + timeFormat.format(current));
        System.out.println("______________________________________");
    }
}
