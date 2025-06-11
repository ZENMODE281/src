import java.util.Scanner;
public class switchprac {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello there please enter your preferred day of the week (1-7)");

        int userInput = scan.nextInt();

        switch (userInput) {
            case 1:
                System.out.println("You picked Sunday");
                break;
            
            case 2:
                System.out.println("You picked Monday");
                break;
            
            case 3:
                System.out.println("You picked Tuesday");
                break;

            case 4:
                System.out.println("You picked Wednesday");
                break;
            default:
                System.out.println("You did not pick any valind day");
                break;
        }




        scan.close();
    }
}
