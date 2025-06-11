import java.util.Scanner;
public class formatting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Enter your first name: ");
        String username = scan.nextLine();

        double userbalance = 1238474.8533322;


        System.out.printf("Hello %s welcome to vern \n", username);
        System.out.printf("Your remaining balance is %,.2f", userbalance);




        scan.close();
    }
}
