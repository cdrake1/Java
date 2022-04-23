import java.util.*;

public class Problem2 {
    public static void main(String[] args)
    {
        //scanner and ask for user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary string: ");
        String binary = input.nextLine();
        input.close();
        int answer = 0;
        try
        { 
            //try to pass value the bin2dec
            answer = bin2Dec(binary);
        }
        catch(NumberFormatException e)
        { 
            //catch exception if doesnt work
            System.out.println("This is not binary");  //print this if exception 
        }
        System.out.print(answer);
    }
    public static int bin2Dec(String binaryS) throws NumberFormatException
    {
        if(isBinary(binaryS) == false)  //check if its binary or not
        {
            throw new NumberFormatException();  //throw exception if not binary
        }
        int exp = 0;
        int decimal = 0;
        //create values and use exponents to calculate decimal
        for (int j = binaryS.length() - 1; j >= 0; j--) {

            if (binaryS.charAt(j) == '1') 
            {
                decimal += Math.pow(2, exp);
            }
            exp++;
        }
        return decimal;  //return decimal
    }
    public static boolean isBinary(String binaryST)
    {
        //change to char array and read through to find out if binary or not
        boolean binaryOr = false;
        char[] toArray = binaryST.toCharArray();
        for(int i = 0; i < toArray.length; i++) 
        {
            if(toArray[i] == '0' || toArray[i] == '1') 
            {
                binaryOr = true;
            }
            else
            {
                binaryOr = false;
                break;
            }
        }
        //if not binary return true or false
        return binaryOr;
    }
    
    
}
