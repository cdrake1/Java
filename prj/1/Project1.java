//The number T is called the mean of two numbers S1 and S2 if T is equal to (S1 + S2)/2. 
//Mike’s birthday present for Steven was two integers S1 and S2. 
//Steven promptly calculated their mean which also happened to be an integer but then lost S2! Help Steven restore S2.

import java.util.Scanner;
public class Project1 {
    public static void main( String[] args)
    {
        Scanner input = new Scanner(System.in);

        //Have the user enter the two integers s1 and t
        System.out.print("Enter the integer values for S1 and T between -1000 and 1000: ");
        int s1 = input.nextInt();
        int t = input.nextInt();

        //Check for validity of inputs
        while (s1 >= 1000 || s1 <= -1000 ||t >= 1000 || t <= -1000)
        {  
            System.out.println("Incorrect input");
            System.out.print("Enter the integer values for S1 and T between -1000 and 1000: ");
             s1 = input.nextInt();
             t = input.nextInt();
        }
            // Calculate for S2
        int S2 = 2 * t - s1;

        //print output
        System.out.println("S2 is equal to " + S2);

        input.close();

    }
    
}
