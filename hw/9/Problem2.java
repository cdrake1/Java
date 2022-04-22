import java.util.*;

public class Problem2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary string: ");
        String binary = input.nextLine();
        input.close();
        int answer = 0;
        try
        {
            answer = bin2Dec(binary);
        }
        catch(NumberFormatException e)
        {
            System.out.println("This is not binary");
        }
        System.out.print(answer);
    }
    public static int bin2Dec(String binaryS) throws NumberFormatException
    {
        if(isBinary(binaryS) == false)
        {
            throw new NumberFormatException();
        }
        int exp = 0;
        int decimal = 0;
        for (int j = binaryS.length() - 1; j >= 0; j--) {

            if (binaryS.charAt(j) == '1') 
            {
                decimal += Math.pow(2, exp);
            }
            exp++;
        }
        return decimal;
    }
    public static boolean isBinary(String binaryST)
    {
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
        return binaryOr;
    }
    
    
}
