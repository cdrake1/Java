//This program displays the average acceleration.
public class Problem2 {
    public static void main(String[] args){
        //Initialize each variable
        double velocity0 = 4.6;
        double velocity1 = 11.5;
        double time = 0.6;
        double a;
        //calculate average acceleration using the initialized variables
        a = (velocity1 - velocity0)/time;
        //print the answer and a closing statement
        System.out.println("The average acceleration for the equation is " + a + " meters per second");
    }
}
