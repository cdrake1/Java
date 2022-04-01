import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args)
    {
        //create and initialize scanner
        Scanner input = new Scanner(System.in);
        //create multidimensional array to store x and y coordinates
        double[][]pointTriangle = new double[3][2];
        //ask for values and store in array
        System.out.println("Enter four points x and y: ");
        for(int i =0; i<3; i++)
        {
            for(int j = 0;j<2; j++)
            {
                pointTriangle[i][j] = input.nextDouble();
            }
        }
        input.close();
        //pass multidimensional array
        double[] centroid = getCenterPoint(pointTriangle);
        //print out results
        System.out.println("The Center point is at: " + "( " + centroid[0] + " , " + centroid[1] + " )");
    }
    

    public static double[] getCenterPoint(double[][] pointTriangle)
    {
        //create another array to store x and y coordinate
        double [] centroid = new double[2];
        //save each x and y coordinate to calculate centerpoint
        double a = pointTriangle[0][0];
        double b = pointTriangle[1][0];
        double c = pointTriangle[2][0];
        double d = pointTriangle[0][1];
        double e = pointTriangle[1][1];
        double f = pointTriangle[2][1];
        //calculate centerpoint
        double valX = (a + b + c)/3;
        double valY = (d + e + f)/3;
        //save x and y centerpoint and return
        centroid [0] = valX;
        centroid [1] = valY;
        return centroid;
    }
}
