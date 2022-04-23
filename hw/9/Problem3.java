import java.util.*;
public class Problem3 
{
    public static void main(String[] args)
    {
        //open scanner and ask for user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary string: ");
        String binary = input.nextLine();
        input.close();
        int answer = 0;
        try
        {
            //try to pass value
            answer = bin2Dec(binary);
        }
        //if it doesnt work catch it
        catch(BinaryFormatException ex)
        {
            System.out.println(ex);
        }
        System.out.print(answer); //print answer
    }
    public static int bin2Dec(String binaryS) throws BinaryFormatException
    {
        if(isBinary(binaryS) == false) //check if binary and pass
        {
            throw new BinaryFormatException(binaryS);  //throw if not binary
        }
        int exp = 0;
        int decimal = 0;
        //calulate decimal from binary
        for (int j = binaryS.length() - 1; j >= 0; j--) {

            if (binaryS.charAt(j) == '1') 
            {
                decimal += Math.pow(2, exp);
            }
            exp++;
        }
        return decimal;  //return the decimal form
    }
    public static boolean isBinary(String binaryST)
    {
        //change into char and check if binary by 0 or 1 values
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
        return binaryOr;  //return answer
    }
}
class BinaryFormatException extends Exception 
{ 
    //constructor class for the exception
        private String s;
	    public BinaryFormatException(String s)
        {
		    super("Invalad Binary Number: " + s);
		    this.s = s;
	    }
	    public String getString()
        {
		return s;
	    }
}

