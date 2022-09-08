//Write a program that generates a random point inside a circle
public class Problem4 {
    public static void main(String[] args)
    {
        //initialize the point through a generator
        // JA: This will generate points outside the circle
        double randomX = Math.random()*(5.0 - -5.0 +1) + -5.0;
        double randomY = Math.random()*(5.0 - -5.0 +1) + -5.0;
        System.out.println("The point is " + "(" + randomX + " , " + randomY + ")");

        //calculate its distance from the center
        double distance = Math.pow(((randomX * randomX) + (randomY * randomY)), 0.5);
        System.out.println("and its distance to the center is " + distance);

    }
    
}
