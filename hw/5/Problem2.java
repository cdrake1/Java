import java.util.Scanner;

public class Problem2 {

    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer"); //prompt for user entry
        int numbers = input.nextInt(); //save value and close scanner
        input.close();
        System.out.println("The binary value is: " + decimalToBinary(numbers)); //write output statement and pass value

    }

    public static String decimalToBinary(int num)
    {
        String binaryNum = ""; //receive value and define a string type binaryNum
        for (int i = num; i > 0; i /= 2)
        {
            binaryNum = (i%2) + binaryNum; //calculate the binary value for a number and return
        }
        return binaryNum;
    }


}
