import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); //import and initialize scanner

        System.out.print("Enter a string: "); //grab user input as string
        String countEm = input.nextLine();
        input.close(); //close input

        int[] stringC = count(countEm); //pass string and grab return array
        for(int j = 0; j< stringC.length; j++) //print out output statement
        {
            if (stringC[j] != 0)
            {
                System.out.println("Digit " + (char)('0' + j) + " appears " + stringC[j] + " times");
            }

        }
    }

    public static int[] count(String countE)
    {
        int[] howMany = new int [10];
        for(int i = 0; i< countE.length(); i++) //run length of string
        {
            if (Character.isDigit(countE.charAt(i))) //if its a digit keep it and count how many of each digit appear
            {
                howMany[countE.charAt(i) - '0']++; //to keep in bounds
            }
        }
        return howMany; //return cont array
    }   
}
