//Write a program that prompts the user to enter the number of the sides, the radius of the bounding circle of a polygon, and displays the coordinates of the corner points on the polygon.
import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //Have the user enter the number of sides
        System.out.print("Enter the number of sides: ");
        double sides = input.nextDouble();
        System.out.print("Enter the radius of the bounding circle: ");
        double radiusBC = input.nextDouble();
        input.close();

        //Calculate the coordinates of the points on the polygon
        System.out.println("The coordinates of the points on the polygon are: ");
        for (int i = 0; i < sides; i++) 
        {
            double x = radiusBC * Math.cos(2 * Math.PI / sides * i);
            double y = radiusBC * Math.sin(2 * Math.PI / sides * i);
        
            //print the coordinates
            System.out.println("(" +  x + " , " + y + ")");
        }

    }
    
}
