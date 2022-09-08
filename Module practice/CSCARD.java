import java.util.Scanner;
public class CSCARD {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        //get the previous balance and additional charges
        System.out.print("Enter the previous balance on the account: ");
        double previousBalance = input.nextDouble();
        System.out.print("Enter the additional monthly charge: ");
        double additionalCharges = input.nextDouble();

        // calculate interest
        double interest = 0.0;
        if (previousBalance != 0){
            interest = (0.2 * previousBalance);
        }

        //calculate new balance
        double newBalance = (previousBalance + additionalCharges);
        double minPayment = 0.0;
        if (newBalance < 50){
            minPayment = newBalance;
        }

        //Print output
        System.out.println("Previous Balance: $" + previousBalance);
        System.out.println("Additional Charges: $" + additionalCharges);
        System.out.println("Interest: $" + interest);

        System.out.println("New Balance: $" + newBalance);
        System.out.println("Minimum Payment: $" + minPayment);



        input.close();
    }
    
}
