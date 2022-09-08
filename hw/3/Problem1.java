//Write a program that prompts the user to enter values for a, b, and c and displays the result based on the discriminant.
import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //have the user input the values for a, b, and c
        System.out.print("Enter the values for a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        //calculate the roots of the equation
        double roots = Math.pow(b, 2) - 4 * a * c;
        
        //determine how many roots there are
        if (roots > 0)
        {
            double rootsO = (-b + Math.pow(roots, 0.5)) / (2 * a);
            double rootsT = (-b - Math.pow(roots, 0.5)) / (2 * a);
            System.out.println("The equation has two roots: " + rootsO + " and " + rootsT);
        }

        else if (roots == 0)
        {
            double rootsO = (-b + Math.pow(roots, 0.5)) / (2 * a);
            System.out.println("the equation has one root:" + rootsO);
        }
        else
        {
        System.out.println("The equation has no real roots");
        }
        input.close();

    }
    
}
