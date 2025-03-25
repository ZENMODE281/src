import java.util.Scanner;
public class areaofcircle {
    public static void main(String[] args)  {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your radius: ");
        double radius = scan.nextInt();

        System.out.println("enter your pi value");
        double pi = scan.nextInt();
    }

    static double sol( double  radius, double pi){
        double solution = pi * radius * radius;

        return solution;
    }
}
