import java.util.Scanner;

public class modulararth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int x = scan.nextInt();

        System.out.print("Enter your second number: ");
        int y = scan.nextInt();

        if (x < 0) {
            int division = x / y;
            int divisionanswer = (int) Math.ceil(division);
        }

        System.out.println(x + " mod " + y + " = " + modular(x, y));

    }

    static int modular (int x, int y ){
        int finalresult = x % y;
        return finalresult;
    }
}
