import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);  //import and initialize scanner
        double [][] polyArray = new double[6][2];  //declare and initialize an array
        //double x = 0;
        //double y = 0;

        //ask for user input and save the points in the multidimensional array
        System.out.print("Enter six points of a convex polygon in clockwise order:  ");
        for(int i = 0 ; i < 6 ; i++)
        {
            for(int j = 0 ; j < 2; j++)
            {
            polyArray[i][j] = input.nextDouble();
            }
            System.out.println();
        }

        //output array
            for(int k = 0 ; k < 6 ; k++)
            {
                for(int l = 0 ; l < 2; l++)
                {
                System.out.print(polyArray[k][l] + " " );
                }
                System.out.println();
            }
        input.close();
        //pass array
        double areaA = PolyArea(polyArray);
        System.out.println(" ");
        System.out.println("The area is: "+ areaA);

        

    }
    public static double PolyArea(double[][] polyA)
    {
        double area1 = 0.0;  //declare area
        double area2 = 0.0;
        double area = 0.0;
        
        double a = polyA[0][0]; //hard code locations
        double b = polyA[0][1];
        double c = polyA[1][0];
        double d = polyA[1][1];
        double e = polyA[2][0];
        double f = polyA[2][1];
        double g = polyA[3][0];
        double h = polyA[3][1];
        double i = polyA[4][0];
        double j = polyA[4][1];
        double kx = polyA[5][0];
        double l = polyA[5][1];
       area1 = ((a*d) + (c*f) + (e*h) + (g*j) + (i*l)); //calculate first half
       area2 = ((b*c) + (d*e) + (f*g) + (h*i) + (j*kx)); //calculate second half

        area = 0.5 * (area1 - area2); //calculate area
        return area; //return area
    }
 }
    

