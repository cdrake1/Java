//Write a program that prompts the user to enter a genome and displays all genes in the genome. 
//If no gene is found in the input sequence, display “no gene is found”.

import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //prompt for user entry
        System.out.print("Enter a genome string: ");
        String genomeS = input.nextLine();
        int start = 0;
        boolean gene = false;
        input.close();

        //read through string for substring
        for(int i = 0; i < genomeS.length()-2; i++)
        {
            String end = genomeS.substring(i,i+3);

            if (end.equals("ATG"))
            {
                start = i + 3;
            }
            else if (((end.equals("TAG")) ||(end.equals("TAG")) || (end.equals("TAA"))))
            {
                String geneS = genomeS.substring(start, i);
                if (geneS.length() % 3 ==0)
                {
                    //print result
                    gene = true;
                    System.out.println(geneS);
                }
            }
        }
        //print result
        if (gene == false)
        {
            System.out.println("no gene found");
        }
    }
}
