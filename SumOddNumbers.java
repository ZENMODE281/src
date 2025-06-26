import java.util.Scanner;

public class SumOddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        System.out.print("Enter an integer: ");
        int n = scan.nextInt();
        
        int sum = 0;

        
        for (int i = 1; i <= n; i += 2) { 
            sum += i;
        }

       
        System.out.println("The sum of all odd numbers from 1 to " + n + " is: " + sum);
        
        scan.close();
    }
}