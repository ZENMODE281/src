import java.util.Scanner;
public class timeskipper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Hello there this code was made to passtime LOL anyways what is your first name?");

        String UserFname = scan.nextLine();


        System.out.println("What is your number for a method i will add the number by 2?");

        int UserNumber = scan.nextInt();

        System.out.println("LOL so that means your first name is " + UserFname +  " And " + " Your final number is " + number(UserNumber));

    }



    public static int number(int UserNumber){
        int result = UserNumber + 2;
        return result;
    }
}
