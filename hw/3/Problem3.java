//Write a program that prompts the user to enter the coordinates of two points and displays the line equation in the slope intercept form,
import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the coordinates for two points:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        //additional calculations
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - (m * x1);
        System.out.println("The line equation for two points is "+ " ( " + x1 + " , " + y1 + " ) " + " and " + " ( " + x2 + " , " + y2 + " ) ");

        //determine line equation
        if (m != 1)
        {
            System.out.println(" y = " + m + " x");
        }
        else  if ( m ==1)
        {
            System.out.println(" is y = x");
        }
        if ( b != 0 && b < 0)
        {
            System.out.println(" - " + (b * -1));
        }
        else if ( b!= 0 && b > 0)
        {
            System.out.println(" + " + b);
        }
        else if ( b == 0)
        {
            System.out.println("");
        }
        input.close();
    }
    
}
