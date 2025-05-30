import java.util.Scanner;
public class lab1 {
    public static void main(String[] args) {
        // question1 
        System.out.println("Welcome to java programming! \n learn how to read input and display output");


        //question2

        Scanner scan  = new Scanner(System.in);

        System.out.println("Enter your first number!");

        double firstNumber = scan.nextInt();


        System.out.println("Enter your second number!");

        double secondNumber = scan.nextInt();

        double result = firstNumber + secondNumber;

        System.out.println("your sum is " + result);

        // question 3

        System.out.println("Enter your first name!");

        String userFirstnm = scan.nextLine();

        System.out.println("Enter your favourite color");

        String usercolor = scan.nextLine();

        System.out.println("your first name is " + userFirstnm + " and your fav color is " + usercolor);

    }
}
