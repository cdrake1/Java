import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total seconds: "); //open scanner and prompt for user input
        int seconds = input.nextInt();
        input.close();

        System.out.println("The hours, minutes, and seconds for total seconds " + seconds + " is " + format(seconds));
        //write output statement and pass input 
    }

    public static String format(int seconds)
    {
        int temp = 0;
        int hours = seconds / 3600;
        int sec = seconds % 60;
        int minutes = (seconds % 3600)  / 60;
        if(hours >= 24)
        {
            hours  = hours / 4;
        }

        String answer = String.format("%02d:%02d:%02d", hours, minutes, sec);

        return answer;

    }
    
}
