import java.util.Scanner;

public class REVISITLAB2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String yes = "Y";

        System.out.print("Hey there! Please enter your age: ");
        int userAge = scan.nextInt();
        scan.nextLine();
        
        System.out.println();


        System.out.println("Ok then, now please enter your citizenship status (Y/N): ");
        String userValidity = scan.nextLine();


        //revisit

        if (userAge >= 18 && userValidity.equals(yes)) {
            System.out.println("Alright then it seems you are legally able to vote! :)");
        } else {
            System.out.println("You do not seem to be able to vote yet :(");
        }

    
        scan.nextLine();  

        scan.close();
        
    }


    // if (userAge >= 18) {
        //     System.out.println("You're over the age of 18, which means you are able to vote!");
        // } else {
        //     System.out.println("You do not meet the age requirement to vote!");
        // }

        // System.out.println("Ok then, now please enter your citizenship status (Y/N): ");
        // String userValidity = scan.nextLine();

        // if (userValidity.equalsIgnoreCase("Y")) {
        //     System.out.println("You are legally able to vote");
        // } else {
        //     System.out.println("You are not legally able to vote");
        // }
}