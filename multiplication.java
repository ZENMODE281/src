import java.util.Scanner;
public class multiplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to multiply: ");
        int num1 = scan.nextInt();
        for (int i = 1; i <= 12; i++) {
           int num2= num1 * i;
           System.out.println(num1 + "X" + i + "=" +num2);
        }
        
    }
}
