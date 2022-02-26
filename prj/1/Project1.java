import java.util.Scanner;

public class Project1 {
    public static void main( String[] args)
    {
        Scanner input = new Scanner(System.in);

        //Have the user enter the two integers S1 and T
        System.out.print("Enter the integer values for S1 and T between -1000 and 1000: ");
        double S1 = input.nextDouble();
        double T = input.nextDouble();

        //Check for validity of inputs
        while (S1 >= 1000 || S1 <= -1000 ||T >= 1000 || T <= -1000)
        {  
            System.out.println("Incorrect input");
            System.out.print("Enter the integer values for S1 and T between -1000 and 1000: ");
             S1 = input.nextDouble();
             T = input.nextDouble();
        }
            // Calculate for S2
        Double S2 = 2 * T - S1;

        //print output
        System.out.println("S2 is equal to " + S2);

        input.close();

    }
    
}
