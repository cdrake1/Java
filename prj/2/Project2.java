import java.util.Scanner; //import java scanner

public class Project2 {
    public static void main(String[] args)
    {
        //import and input scanner for user input
        Scanner input = new Scanner(System.in);

        //create and initialize an array with a space of 10 for each integer
        int[] intArray;
        intArray = new int[10];

        int[] arrayTwo;  //initialize a check array and set all values to -1
        arrayTwo = new int[42];

        //grab user input and put each value into the array, then close the scanner
        System.out.println("Enter 10 non negative integers, each less than 1000: ");        
        for (int i = 0; i<10; i++)
        {
            intArray[i] = input.nextInt();
        }
        input.close();       

        int count = 0;   //create a count variable to count when there is a value with a remainder
        for(int i = 0; i< intArray.length; i++)
        {
            arrayTwo[intArray[i] % 42] = 1;
        }
        for(int j = 0; j<arrayTwo.length; j++)
        {
            count += arrayTwo[j];
        }
        //print out the final count
        System.out.println(count);
    }
}
