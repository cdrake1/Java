import java.util.Scanner;
//create a java program to change celsius into fahrenheit
public class CelsiusFahrenheit 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        double celsius;
        System.out.print("Enter a degree in Celsius: ");
        celsius = input.nextDouble();

        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println(celsius + " Celsius is " + fahrenheit + " fahrenheit");
        input.close();
    }
    
}
