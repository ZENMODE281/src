import java.util.Scanner;

public class methodpractice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        System.out.print("Please enter the first number: ");
        int num1 = scan.nextInt();

        
        System.out.print("Enter your second number: ");
        int num2 = scan.nextInt();

        
        int result = subtraction(num1, num2);
        System.out.println("The result of subtraction is: " + result);
    }

    
    static int subtraction(int num1, int num2) {
        int solution = num1 - num2;
        return solution;
    }
}
