//Write a program that prompts the user to enter the number of sides and their length of a regular polygon and displays its area.
import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //Have the user enter the number of sides and their length
        System.out.print("Enter the number of sides: ");
        double sides = input.nextDouble();
        System.out.print("Enter the length of the sides: ");
        double length = input.nextDouble();
        input.close();

        //Calculate the area
        double area = (sides * (length * length)) / (4 * Math.tan(Math.PI / sides));

        //Print result
        System.out.println("The area of the polygon is " + area);

    }
    
}
