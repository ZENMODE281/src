import java.util.Scanner;
import java.text.DecimalFormat;

public class InvestmentCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double investmentAmount = 0;
        double annualInterestRate = 0;
        int numberOfYears = 0;


        try {
            System.out.print("Enter investment amount: ");
            investmentAmount = Double.parseDouble(input.nextLine());
            if (investmentAmount <= 0) {
                System.out.println("Please enter a positive number for investment amount.");
                return;
            }

            System.out.print("Enter annual interest rate (e.g., 4.25): ");
            annualInterestRate = Double.parseDouble(input.nextLine());
            if (annualInterestRate <= 0) {
                System.out.println("Please enter a positive number for interest rate.");
                return;
            }

            System.out.print("Enter number of years: ");
            numberOfYears = Integer.parseInt(input.nextLine());
            if (numberOfYears <= 0) {
                System.out.println("Please enter a positive number for years.");
                return;
            }

            double monthlyInterestRate = annualInterestRate / 1200;
            double futureInvestmentValue = investmentAmount *
                Math.pow(1 + monthlyInterestRate, numberOfYears * 12);

            DecimalFormat df = new DecimalFormat("0.00");
            System.out.println("Accumulated value is " + df.format(futureInvestmentValue));

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numeric values only.");
        }

        input.close();
    }
}




