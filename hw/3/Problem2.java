import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //initialize variables
        System.out.print("Enter a numerator: ");
        int numerator = input.nextInt();
        System.out.print("Enter a denominator ");
        int denominator = input.nextInt();

        //determine if they make a proper or improper fraction
        if (numerator < denominator)
        {
            System.out.println(numerator + " / " + denominator + " is a proper fraction");
        }
        else if (numerator % denominator == 0)
        {
            int reduced = numerator / denominator;
            System.out.println(numerator + " / " + denominator + " is an improper fraction and it can be reduced to " + reduced);
        }
        else
        {
            int reduced = numerator / denominator;
            int mixed = numerator % denominator;
            System.out.println(numerator + " / " + denominator + " is a improper fraction and it's mixed fraction is " + reduced + " + " + mixed + " / " + denominator);
        }
        input.close();
    }
    
}