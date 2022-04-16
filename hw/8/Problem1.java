import java.util.*;

public class Problem1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //grab user input for a string and delimiters
        System.out.print("Enter a string: ");
        String a = input.nextLine();
        System.out.print("Enter some delimiters: ");
        String delimiter = input.nextLine();
        input.close();

        //put the delimiters inside a char array
        char[] delimArray = delimiter.toCharArray();
        //create an array list while passing the string and delimiters
        ArrayList<String> done = split(delimArray, a);
        System.out.print(done);
    }
    public static ArrayList<String> split(char[]delimiters, String ab)
    {
        //create arraylist to save answer
        ArrayList<String> answer = new ArrayList<>();
        //create variables to replace delimiters within the string
        String answer1 = " ";
        char a = delimiters[0];
        char b = delimiters[1];
        //read through string and find the delimiters
        for(int i = 0; i < ab.length(); i++)
        {
            if(ab.charAt(i) == a || ab.charAt(i) == b)
            {
                //replace the delimiters
                answer1 = ab.replace(a, ',')
                .replace(b, ',');
            }
        }
        //add them to arraylist and return
        answer.add(answer1);
        return answer;
    }

    
}
