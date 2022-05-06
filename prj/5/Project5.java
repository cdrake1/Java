import java.util.*;

public class Project5 extends Complex
{
    public static void main(String[] args)
    {
        //open scanner and grab user input for two complex numbers
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first complex number: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        System.out.print("Enter the second complex number: ");
        double c = input.nextDouble();
        double d = input.nextDouble();
        input.close();
        //save input values as complex numbers
        Complex one = new Complex(a, b);
        Complex two =  new Complex(c, d);
        //print out statement and call addition
        System.out.print(one + " + " + two + " = ");
        System.out.print(add(one, two));
        System.out.print("\n");
        //print out statement and call subtraction
        System.out.print(one + " - " + two + " = ");
        System.out.print(subtract(one, two));
        System.out.print("\n");
        //print out statement and call multiplication
        System.out.print(one + " * " + two + " = "); 
		System.out.print(multiply(one, two));
        System.out.print("\n");
        //print out statement and call division
        System.out.print(one + " / " + two + " = "); 
		System.out.print(divide(one, two));
        System.out.print("\n");
        //print out statement and call absolute value for complex one
        System.out.print(" | " + one + " | " + " = "); 
        System.out.print(abs(one));
    }
}
