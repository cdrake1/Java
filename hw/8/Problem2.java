import java.util.*;

public class Problem2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        //create arraylist and accompanying variables
        ArrayList<Integer> objectList =new ArrayList<>();
        int maxSize = 10;
        int container = 1;
        //grab user input for objects and weights
        System.out.print("Enter the number of objects: ");
        int numObj = input.nextInt();
        System.out.print("Enter the weights of the objects: ");
        for(int i = 0; i<numObj; i++)
        {
            //add them to arraylist
            objectList.add(input.nextInt());
        }
        input.close();
        //use while loop until the list is empty
        while(!objectList.isEmpty())
        {
            //print out line by line the answers
            System.out.print("Container " + container++ + " contains abjects with weight " + ContainerSize(objectList, maxSize));
            System.out.print('\n');
        }
    }    
    public static String ContainerSize(ArrayList<Integer> objects, int size)
    {
        //create a variable and read through arraylist
        String answer = " ";
        for (int i = 0; i < objects.size(); i++) 
        {
            //check to see if less than or equal to 10
            if(objects.get(i) <= size) 
            {
                //remove objects and weights and seperate them into containers
                int ab = objects.get(i);
                answer += ab + " ";
                objects.remove(i);
                //return containers
                return answer + ContainerSize(objects, size - ab);
            }
        }
        //return containers
        return answer;
    }
}
        