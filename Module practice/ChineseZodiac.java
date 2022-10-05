//this program will determine the chinese zodiac of the input year
import java.util.Scanner;
public class ChineseZodiac {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = input.nextInt();

        switch(year%12)
        {
            case 0: System.out.println("Year of the Monkey"); break;
            case 1: System.out.println("Year of the rooster"); break;
            case 2: System.out.println("Year of the dog"); break;
            case 3: System.out.println("Year of the pig"); break;
            case 4: System.out.println("Year of the rat"); break;
            case 5: System.out.println("Year of the ox"); break;
            case 6: System.out.println("Year of the tiger"); break;
            case 7: System.out.println("Year of the rabbit"); break;
            case 8: System.out.println("Year of the dragon"); break;
            case 9: System.out.println("Year of the snake"); break;
            case 10: System.out.println("Year of the horse"); break;
            case 11: System.out.println("Year of the sheep");
        }
        input.close();
    }
    
}
