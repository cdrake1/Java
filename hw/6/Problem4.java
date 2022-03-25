import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);  //import and initialize scanner
        // initialize array and ask for user input
        double[][] arrayA = new double[2][2];
        System.out.println("Enter a, b, c, d: ");
        
        for(int i = 0 ; i < 2 ; i++) //run for loop to add values to array
        {
            for(int j = 0 ; j < 2; j++)
            {
            arrayA[i][j] = input.nextDouble();
            }
            System.out.println();
        }

        input.close(); //close input
        double[][] arrayB = inverse(arrayA); //pass array

        for(int x = 0 ; x < 2 ; x++) //print out answer
            {
                for(int y = 0 ; y < 2; y++)
                {
                System.out.print(arrayB[x][y] + " " );
                }
                System.out.println();
            }
    }

    public static double[][] inverse(double[][] A)
    {
        double matrix = 0.0; //create variable matrix
        double[][] arrayBB = new double[2][2]; //initialize new array
        //hardcode each values position
        double a = A[0][0];
        double b = A[0][1];
        double c = A[1][0];
        double d = A[1][1];
        matrix = (1/(A[0][0] * A[1][1] - A[0][1] * A[1][0])); //calculate matrix value

        //calculate inverse of the input values
        arrayBB[0][0] = matrix * d;
        arrayBB[0][1] = matrix * - b;
        arrayBB[1][0] = matrix * - c;
        arrayBB[1][1] = matrix * a;
        
        return arrayBB; //return array and answers
    }
    
}
