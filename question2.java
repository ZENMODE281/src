import java.util.Scanner;
public class question2 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the amount borrowed: ");
            double borrowedAmount = scan.nextInt(); 

            System.out.println("Enter the interestrate: ");
            float interestRate = scan.nextInt();   
            
            System.out.println("Enter the yearly payment: ");
            double yearlyPayment = scan.nextInt();  
    
            int yearsToPayOff = mortgage(borrowedAmount, interestRate, yearlyPayment);
            System.out.println("The mortgage will be paid off in " + yearsToPayOff + " years.");
        }
    
        public static int mortgage(double money, float interestRate, double payment) {
            int years  = 0;
    
            while (money > 0) {
                
                double interest = money * interestRate;
    
               
                money = money + interest - payment;
    
                
                years++;
    
                
                if (money > 0) {
                    System.out.println("Year " + years + ": Remaining balance = " + String.format("%.2f", money));
                } else {
                    System.out.println("Year " + years + ": Remaining balance = 0.00");
                }
    
                
                if (money > 0 && payment <= interest) {
                    System.out.println("Payment is too low to cover the interest. Mortgage cannot be paid off.");
                    return -1; 
                }
            }
    
            return years; 
        }
    
}
