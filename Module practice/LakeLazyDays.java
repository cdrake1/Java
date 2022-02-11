import java.util.Scanner;
public class LakeLazyDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the temperature: ");
        double temp = input.nextDouble();

        if (temp >= 80){
            System.out.println("Go Swimming");
        }
        else if (60 <= temp < 80){
            System.out.println("Play tennis");
        }
        else if ( 40 <= temp < 60){
            System.out.println("Go play Golf");
        }
        else
        System.out.println("Go Skiing or Snowboarding");

    }
}