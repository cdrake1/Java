import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //have the user enter the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        //calculate the diameter and area
        double diameter = (2 * radius);
        double area = (3.141592 * (radius * radius));

        //print out the radius, diameter, and area of the circle
        System.out.println("The radius of the circle is: " + radius);
        System.out.println("The diameter of the circle is: " + diameter);
        System.out.println("The area of the cirlce is: " + area);
        input.close();
        
    }
    
}

