import java.util.Scanner;

public class evenorodd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your value and I'll decide if it's even or odd: ");
        int userinput = scan.nextInt();

        sol(userinput); 

        scan.close();
    }

    static void sol(int userinput) { 
        if (userinput % 2 == 0) {
            System.out.println("Your value " + userinput + " is an even number");
        } else {
            System.out.println("Your value " + userinput + " is an odd number");
        }
    }
}