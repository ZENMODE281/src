import java.util.Random;
import java.util.Scanner;
public class guessinggamerevisit {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        Random rand = new Random ();

        int randomnum = rand.nextInt(21);

        System.out.println("Guess any number from 1-20");

        int userChoice = scan.nextInt();

        if (userChoice == randomnum) {
            System.out.println("Wow you guessed right!!");
        } else{
            for (int i = 0; i != randomnum; i++) {
                
                
            }
        }

        
        



    }
}
