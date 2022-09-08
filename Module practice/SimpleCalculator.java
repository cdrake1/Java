import java.util.Scanner;

public class SimpleCalculator 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double num1;
        double num2;
        String operation;

        System.out.println("Please enter the first number: ");
        num1 = input.nextDouble();
        System.out.println("Please enter the second number: ");
        num2 = input.nextDouble();

        Scanner op = new Scanner(System.in);

        System.out.println("Please enter the operation sign you want to use: ");
        operation = op.nextLine();

        double ans;
        if(operation == "+")
        {
            ans = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + ans);
        }
        if(operation == "-")
        {
            ans = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + ans);
        }
        if(operation == "/")
        {
            ans = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + ans);
        }
        if(operation == "*")
        {
            ans = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + ans);
        }
        if(operation == "%")
        {
            ans = num1 % num2;
            System.out.println(num1 + " % " + num2 + " = " + ans);
        }

        input.close();
        op.close();
    }
    
}
