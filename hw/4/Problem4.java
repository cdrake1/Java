//Write a program that prompts the user to enter a positive integer 
//and obtains its square root in simplest form.
import java.util.Scanner;
public class Problem4 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //prompt for user input
        System.out.print("Enter a positive integer: ");
        double positiveI = input.nextDouble();
        double squareR = Math.sqrt(positiveI);
        input.close();

        if (squareR - Math.floor(squareR) == 0)
        {
            System.out.println("sqrt" + "(" + positiveI + ")" +  "is "  + squareR);
        }
        else
        {
            int outside = 1;
            double inside = positiveI;
            int i = 2;
            while (i * i <= inside)
            {
                if (inside % (i * i) == 0)
                {
                    inside= inside / (i * i);
                    outside = outside * i;
                }
                else
                {
                    i = i + 1;

                }
            }
            System.out.println("sqrt" + "(" + positiveI + ")" +  "is "  + outside + " * sqrt" + "(" + inside + ")");
        }

    }
}