import java.util.Scanner;


public class Problem1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        //grab user input for values a b and c
        System.out.print("Enter the values for a, b and c; ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        input.close();

        //pass values and define variable
        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        //make discriminant variable
        double discriminant = equation.getDiscriminant();
        //if statements to print out roots
        if( discriminant > 0)
        {
            System.out.println("Root 1: " + equation.getRoot1() + " Root 2: " + equation.getRoot2());

        }
        else if(discriminant == 0)
        {
            System.out.println("Root 1: " + equation.getRoot1());

        }
        else
        {
            //discriminant is less than zero
            System.out.println("The equation has no roots");

        }

    }

    
    // JA: Where is the UML diagram?
    public static class QuadraticEquation {
    /** The values a,b and c */
    private double vala = 0;
    private double valb = 0;
    private double valc = 0;
  
        public QuadraticEquation(double a, double b, double c) {
        this.vala = a;
        this.valb = b;
        this.valc = c;
        }
    
        /** Return a */
        public double getValA() {
        return vala;
        }
        /** Return b */
        public double getValB() {
            return valb;
        }
        /** Return c */
        public double getValC() {
            return valc;
        }
    
            /** Return roots */
        public double getRoot1() {
        return (-valb + Math.sqrt((valb * valb) - (4*vala*valc))) / (2 * vala);
        }
            /** Return roots */
        public double getRoot2() {
            return (-valb - Math.sqrt((valb * valb) - (4*vala*valc))) / (2 * vala);
        }
    
        /** Return the discriminant */
        public double getDiscriminant() {
        return ((valb * valb) - (4*vala*valc));
        }
    }

}
