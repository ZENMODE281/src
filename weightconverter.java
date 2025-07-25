import java.util.Scanner;
public class weightconverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. convert kilograms to pounds \n2. Convert pounds to kilograms");

        int userchoice = scan.nextInt();


        if (userchoice == 1) {
            System.out.println("How many kilograms do you want to convert?");
            
            int userkg = scan.nextInt();

            double convkg = userkg * 2.20462;

            System.out.println("your kg has been converted from " + userkg + " to " + convkg);

        } else if (userchoice == 2) {
          System.out.println("How many pounds do you want to convert?");

          int userlbs = scan.nextInt();

          double convlbs = userlbs * 0.453592;

          System.out.println("Your lbs has been converted from " + userlbs + " to " + convlbs);
            
        } else {
            System.out.println("You have entered an invalid choice!");
        }

        
        scan.close();
    }
}


// - 2.20462 - 0.453592

 
