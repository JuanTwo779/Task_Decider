import java.util.Scanner;

public class Input {

    public Input() {}

    public int acceptIntInput(String message)
    {
        Scanner console = new Scanner(System.in);
        int input = -1;
        while(input < 0) //loop until valid integer
        {
            System.out.println(message);
            try //try,catch to ensure integer is valid
            {
                input = Integer.parseInt(console.nextLine());
            }
            catch (Exception e)
            {
                System.out.println("Input must be an integer and cannot be blank");
                input = -1;
            }
        }
        return input;
    }

    public String acceptStringInput(String message) {
        Scanner console = new Scanner(System.in);
        String input = "";
        int flag = 0;
        while (flag < 0) //loop until valid integer
        {
            System.out.println(message);
            try //try,catch to ensure integer is valid
            {
                input = console.nextLine();
                flag = 1;
            } catch (Exception e) {
                System.out.println("Input must be a string and cannot be blank");
                flag = -1;
            }
        }
        return input;
    }
}