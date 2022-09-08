import java.util.Scanner;

public class Anagram {
    public static boolean isAnagram(String s1, String s2)
    {
        int str1 = s1.length();
        int str2 = s2.length();
        if (str1 != str2)
        {
            return false;
        }
        for(int i = 0; i < Str1; i++)
        {
            if(str1[i] != str2[i])
            {
                return false;
            }
        return true;
        }

    }
    public static void main(String[] args)
    {
        input Scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String String1 = input.nextLine();
        String[] myString1 = {String1};

        System.out.print("Enter the second string: ");
        String String2 = input.nextLine();
        String[] myString2 = {String2};

        input.close();

        if (isAnagram(s1, s2)
        {
            System.out.println(isAnagram(myString1, myString2) + "are an anagram");
        }
        else
        {
            System.out.println(isAnagram(myString1, myString2) + "are not an anagram");

        }
        

    }
    
}
