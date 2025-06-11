import java.util.Scanner;

public class McDonaldsOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int totalPrice = 0;

        System.out.println("Hey there, welcome to McDonald's!");
        System.out.println("We have 3 options on our menu:");
        System.out.println("Small burger - $2 | Medium burger - $5 | Large burger - $10");
        System.out.println("Type 'done' when you have finished ordering.");

        while (true) {
            System.out.print("Enter burger size (small, medium, large): ");
            String userChoice = scan.nextLine().toLowerCase();

            if (userChoice.equals("done")) {
                break;
            }

            switch (userChoice) {
                case "small":
                    totalPrice += 2;
                    break;
                case "medium":
                    totalPrice += 5;
                    break;
                case "large":
                    totalPrice += 10;
                    break;
                default:
                    System.out.println("Invalid input :( Please enter 'small', 'medium', or 'large'.");
                    continue; 
            }

            System.out.println("Added " + userChoice + " burger to your order.");
        }

        System.out.println("Your total price is: $" + totalPrice);
        scan.close();
    }
}