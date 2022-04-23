import java.util.*;
public class Problem1 {
    public static void main(String[] args)
    {
        //import and initialize scanner
        Scanner input = new Scanner(System.in);
        int[] randomArr = new int[100];
        for(int i = 0; i < randomArr.length; i++)
        {
            randomArr[i] = (int)(Math.random() * 100) + 1;
        }
        //fill array with random numbers
        try
        {
            //try to look for index in array
            System.out.print("Enter an index: ");
            int index = input.nextInt();
            int check = (int)randomArr[index];
        }
        catch(Exception e)
        {
            //if not found print this statement
            System.out.println("Out of Bounds");

        }
        finally
        {
            //when either is complete print this
            System.out.println("Done");

        }
        input.close(); 
        //close input
    }
}
