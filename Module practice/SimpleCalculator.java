import java.util.Scanner;

public class SimpleCalculator 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        double num1 = input.nextDouble();
        System.out.println("Please enter the second number: ");
        double num2 = input.nextDouble();

        System.out.println("Please enter the operation sign you want to use: ");
        String op = input.next();

        double ans = 0;
        if(op.equals("+"))
        {
            ans = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + ans);
        }
        if(op.equals("-"))
        {
            ans = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + ans);
        }
        if(op.equals("/"))
        {
            ans = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + ans);
        }
        if(op.equals("*"))
        {
            ans = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + ans);
        }
        if(op.equals("%"))
        {
            ans = num1 % num2;
            System.out.println(num1 + " % " + num2 + " = " + ans);
        }

        input.close();
    }
    
}
