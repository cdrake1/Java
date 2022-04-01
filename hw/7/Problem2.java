import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args)
    {
        //create and initialize scanner
        Scanner input = new Scanner(System.in);
        //create multidimensional array to store x and y coordinates
        double[][]pointArray = new double[4][2];
        System.out.println("Enter four points x and y: ");
        for(int i =0; i<4; i++)
        {
            for(int j = 0;j<2; j++)
            {
                pointArray[i][j] = input.nextDouble();
            }
        }
        input.close();
        //pass values
        double[] values = getIntersectingPoint(pointArray);
        //check whether null or data type answers
        //print out answer
        if(values == null)
        {
            System.out.println("The lines are parallel to each other");
        }
        else
        {
            System.out.println("The intersecting point is at " + "( " + values[0] + " , " + values[1] + " )" );
        }
    }


    public static double[]  getIntersectingPoint(double[][] pointArray)
    {
        //save values for each coordinates location
        double k =pointArray[0][1]-pointArray[1][1];
        double l =pointArray[0][0]-pointArray[1][0];
        double m =pointArray[2][1]-pointArray[3][1];
        double n =pointArray[2][0]-pointArray[3][0];
        double o = (pointArray[0][1]-pointArray[1][1]) * pointArray[0][0]- (pointArray[0][0] - pointArray[1][0]) * pointArray[0][1];
        double p =(pointArray[2][1]- pointArray[3][1]) * pointArray[2][0]- (pointArray[2][0] - pointArray[3][0]) * pointArray[2][1];
        //calculate equation
        double equation = k*n - l*m;
        //check whether equation equals zero or not
        if(equation == 0)
        {
            return null;
        }
        //create array and save answer
        double[]values = new double [2];
        values[0] = (o*n - l*p)/equation;
        values[1] = (k*p - o*m)/ equation;
        //return answer
        return values;
    }

}
