//write a program to find out the height of the building, given the travel time for the ball to the ground
import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Have the user enter the travel time
        System.out.print("Enter the ball travel time in seconds: ");
        double ballTime = input.nextDouble();

        //initailize variables
        double velocity0 = (0.0);
        double acceleration = (9.8);
        double distance = 0.0;

        //calculate height of the bulding
        distance = ((velocity0 * ballTime) + ((acceleration * (ballTime * ballTime)  / 2)));
        
        //output answer
        System.out.println("The height of the building is: " +  distance);
        input.close();
    }
    
}
