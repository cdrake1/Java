import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: "); // prompt for user input and then close scanner
        String sentence = input.nextLine();
        input.close();

        String sentence1 = sentence.replaceAll("\\s{2,}", " "); //remove all useless white space
        System.out.println("The new string is: " + title(sentence1)); // write output statement and pass variable
    }
   public static String title(String s)
    {
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }
        
    
}
