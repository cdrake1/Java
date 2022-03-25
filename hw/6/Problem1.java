public class Problem1 {
    public static void main(String[] args)
    {
        //declare and initialize two arrays with space of 100 and 10
        int[] randomArray = new int[100];
        int[] countArray = new int[10];

        //read through array with 100 space and populate it with random numbers between 0 and 9
        for (int i = 0; i<randomArray.length; i++)
        {
            int ran =  (int)(Math.random() * 10) ;
            randomArray[i] = ran;
            countArray[ran]++; // count how many of each value there is and store it in other array
        }

        //read through second array and print out the count for each number
        for (int j = 0; j<countArray.length; j++) 
        {
            System.out.print(countArray[j] + " ");

        }
    }
}
