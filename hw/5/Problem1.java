import java.util.Scanner;

public class Problem1 {
    public static int multiplyDigits (long n)
    {
        int newValue = (int)n;
        int sum = 0;
        int sum1 = 1;
        
        while(newValue > 0)
        {
            sum = newValue % 10;
            sum1 = sum * sum1;
            if(newValue != 0)
            {
                newValue = newValue/10;

            }
        }
        return sum1;
        
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer ");
        long num = input.nextLong();
        input.close();
        System.out.println("The sum of all the numbers is: " + multiplyDigits(num));
    }
}