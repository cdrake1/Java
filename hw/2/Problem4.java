//Write a program that prompts the user to enter the minutes and displays the maximum number of years and remaining days for the minutes.
import java.util.Scanner;
public class Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //enter and initialize variables
        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();

        //calculate the number of days and years
        int years = minutes / 525600;
        int days = (minutes % 525600) / 1440;

        //print output
        System.out.println(minutes + "Minutes is approximately " + years + " years and " + days + " days");
        input.close();
        
    }
    
}
