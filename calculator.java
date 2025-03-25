import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("enter your first number");
        int num1 = scan.nextInt();

        System.out.println("Enter your second number");
        int num2 = scan.nextInt();

        System.out.println("Do you have any more values to add? (1 = yes, 2 = no) max additional values is 5");
        
        int choice = scan.nextInt();

        // if (choice = 1) {

        //    int i = 0;

        //    int counter = 0;

        //     while (i <= 5) {
        //         System.out.println("Enter your desired value");
        //         int morenum = scan.nextInt();
        //         int counter2 = counter++;
        //     }
        // } else{
        //     System.out.println("Thanks for the info");
        // }
        
        System.out.println("which operation do you want for all your values (+, -, /, *) ");
        char operator = scan.next().charAt(0);

    }

    // addition
    static int addition(int num1, int num2, int morenum) {
      int result = num1 + num2 + morenum;
      return result;
    }


    //subtraction
    static int subtraction(int num1, int num2, int morenum){
        int subresult = num1 - num2 - morenum;
        return subresult;
    }

    //division
    static int division( int num1, int num2, int morenum){
        int divresult = num1 / num2;
        return  divresult;
    }

}
