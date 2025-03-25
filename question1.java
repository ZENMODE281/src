import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        System.out.print("Please enter your deposit amount: ");
        double userdeposit = scan.nextDouble();

        
        System.out.print("What is the interest rate please?: ");
        float interestrate = scan.nextFloat();

        
        System.out.print("How long does the customer want to keep their money with us?: ");
        int duration = scan.nextInt();

       
        double finalAmount = solution(userdeposit, interestrate, duration);
        System.out.println("Final balance after " + duration + " years: " + finalAmount);
    }

    public static double solution(double userdeposit, float interestrate, int duration) {
        double finalbalance = userdeposit;

        
        for (int i = 1; i <= duration; i++) {
            double interest = finalbalance * (interestrate / 100); 
            finalbalance += interest; 
            System.out.println("Year " + i + ": " + finalbalance); 
        }

        return finalbalance; 
    }
}




 // double interest = userdeposit * interestrate;   //wrong formula???

        // return interest;