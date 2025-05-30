import java.util.Scanner;

public class revive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        int userinput = scan.nextInt();

        if (userinput % 2 != 0) {
            System.out.println("Your number is an odd number");
        } else{
            System.out.println("Your number is an even number");
        }
    }
}
