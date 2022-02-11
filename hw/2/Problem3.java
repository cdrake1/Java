import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        //initialize the variables
        System.out.print("Enter the friction force in Newtons: ");
        double frictionF = input.nextDouble();
        System.out.print("Enter the objects mass in kg: ");
        double mass = input.nextDouble();
        System.out.print("Enter the objects acceleration in m/s^2: ");
        double acceleration = input.nextDouble();

        //calculate the coefficient for friction
        double frictionCoef = 0.0;
        frictionCoef = ((frictionF)/ (mass * 9.8)) - (acceleration / 9.8);
        System.out.println("The coefficient for friction is: " + frictionCoef);
        input.close();

    }
    
}
