import java.util.Scanner;

public class complicated {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String add = "add";
        String sub = "subtract";
        String mul = "multiply";

        System.out.println("What process do you want to do?: ");
        System.out.println("Type multiply to multiply ");
        System.out.println("Type add to add ");
        System.out.println("Type subtract to subtract ");
        String choice = scan.nextLine();

        System.out.print("You have chosen to " + choice + ". ");

        if (choice.equals(add)) {
            System.out.println("Let's add numbers!");
        } else if (choice.equals(sub)) {
            System.out.println("Let's subtract numbers!");
        } else if (choice.equals(mul)) {
            System.out.println("Let's multiply numbers!");
        } else {
            System.out.println("Invalid choice.");
        }

        scan.close();
    }
}


