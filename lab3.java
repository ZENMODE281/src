import java.util.Scanner;
import java.util.Random;
public class lab3 {
    public static void main(String[] args) {
        Random rand = new Random();

        int randnumber = rand.nextInt(50);
        Scanner scan = new Scanner (System.in);

        System.out.println("Try guessing the right number between 1 - 50");
        int userguess = scan.nextInt();

        process(userguess, randnumber);
        System.out.println();
        scan.close();
    }

    public static void process (int userguess, int randnumber){

        Scanner scan2 = new Scanner (System.in);
        

        if (userguess == randnumber) {
            System.out.println("Good going you're right the mystery number was " + randnumber);
        } else{

            while (userguess != randnumber) {
                int userguess2 = scan2.nextInt(); 
            
                if (userguess2 > randnumber) {
                    System.out.println("Too high try again bro :)");
                } else if (userguess2 < randnumber) {
                    System.out.println(" too low try again bro");
                }
                else {
                    System.out.println("You got it! the right answer was " + randnumber);
                }
            }
            
            
                
        }

        scan2.close();
    }
}
