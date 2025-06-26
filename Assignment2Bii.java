import java.util.Scanner;
public class Assignment2Bii {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.print("Enter a numerator: ");
        int numerator = scan.nextInt();


        System.out.print("Now enter a denomenator: ");
        int denomenator = scan.nextInt();


        if (denomenator > numerator) {
            System.out.println("Your answer is a proper fraction " + numerator + " / " + denomenator);
        } else{
            int remainder = numerator % denomenator;
            int wholenumber = numerator / denomenator;

            System.out.println("Your answer is a mixed fraction which is " + wholenumber + " + " + remainder + " / " + denomenator);
        }

        scan.close();
    }
}
