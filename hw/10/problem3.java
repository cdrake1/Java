import java.util.Scanner;
public class problem3 extends Rational
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    
    //grab first rational number and parse it
    System.out.print("Enter the first rational number: ");
    String rat1 = input.nextLine();
    Rational answer1 = parseRationalNumber(rat1);
    //grab second rational number and parse it
    System.out.print("Enter second rational number: ");
    String rat2 = input.nextLine();
    Rational answer2 = parseRationalNumber(rat2);

    //add rational numbers together
    Rational addition = answer1.add(answer2);
    System.out.print(answer1 + " + " + answer2 + " = " + addition);
    input.close();
  }

}
