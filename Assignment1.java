import java.util.Arrays;
import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) {

        Scanner Scan = new Scanner (System.in);
        // i honestly dont understand how to do the first question, although i might be able do this without using loops

        //question 1
        System.out.print("How many steps do you want?: ");
        int UserSteps = Scan.nextInt();

        
        for(int j = 0; j < UserSteps; j++){
            System.out.println(" ");
            System.out.println("#");
        }


        //Question 2

        String UserName = "Naseef Ogunsola";

        String UserStreet = "14 windsor ave";

        String UserCity = "avenor";

        String province = "Ontario";

        String postalcode = "L7X 23A";

        String [] AllVariables = {UserName, UserStreet, UserCity, province, postalcode};

        for(int i = 0; i < AllVariables.length; i++){
           System.out.println(AllVariables[i]);;
        }

        System.out.println("Press any key to continue . . .");

        
       

        // question 3

        System.out.println("Question 3");

        System.out.println("N       N      O O    ");
        System.out.println("N  N    N   O       O  ");
        System.out.println("N    N  N   O       O ");
        System.out.println("N      NN   O       O  ");
        System.out.println("N       N      O O     ");
    }
}
