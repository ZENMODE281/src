
import java.util.Scanner;

public class topmark {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        

        System.out.println("How many marks do you want to input?");
        int arraylength = scan.nextInt();

        int[] array = new int[arraylength];

        System.out.println("Enter your values");
        for (int i = 1; i < array.length; i++) {
        array[i] = scan.nextInt();
        }

        System.out.println("Your max value is " + highestmark(array));

    }

    public static int highestmark(int[] array ){
        int maxValue = 0;
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxValue = i;
            }
    
        }
        return maxValue;
    }

    public static int markindex(int [] array){
        for (int i = 0; i < array.length; i++) {

            int maxIndex = 0;
            int maxValue = 0;
            if (array[i] > maxValue) {
                maxIndex = array[i];
                maxIndex = i;
            } 
        }
        return maxIndex;
     }
}
