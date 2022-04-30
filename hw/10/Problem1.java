import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args)
    {
        //import scanner and java language
        Scanner input = new Scanner(System.in);
        //grab user input for hours minutes and seconds
        System.out.print("Enter time1 (hour minute second): ");
        int hour = input.nextInt();
        int minute = input.nextInt();
        int second = input.nextInt();
        //make new instance of time
        Time time1 = new Time(hour, minute, second);
        //print out time1 as string
        System.out.print(time1.toString());
        //output elapsed time for time1
        System.out.print("Elapsed seconds in time1: " + time1.getSeconds() + "\n");
        //grab user input for elapsed time
        System.out.print("Enter time2 (elapsed time): ");
        Long elapsed1 = input.nextLong();
        //create new instance of time for elapsed time
        Time elapsed = new Time(elapsed1);
        //output as string
        System.out.printf("%d:%d:%d%n%n",
        elapsed.getHour(),
        elapsed.getMinute(),
        elapsed.getSecond());
        //output as elapsed time
        System.out.print("Elapsed time in time2: " + elapsed1  + "\n");
        //check compare to statement and print out answer
        if(time1.compareTo(elapsed) == -1 || time1.compareTo(elapsed) == 1 || time1.compareTo(elapsed) == 0 )
        {
            int answer = (int)(time1.getSeconds() - elapsed1);
            System.out.println("Compare both times: " + answer);
        }
        input.close();
    }

}

