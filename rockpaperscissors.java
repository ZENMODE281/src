import java.util.Random;
import java.util.Scanner;

public class rockpaperscissors {
    public static void main(String[] args) {
        System.out.println("Hey there, let's play Rock, Paper, Scissors!");
        
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        
        System.out.print("How many rounds do you want to play? ");
        int rounds = scan.nextInt();
        
        for (int round = 1; round <= rounds; round++) {
            int computerChoice = random.nextInt(3) + 1;
            
            System.out.print("Press 1 to choose Rock, 2 for Paper, or 3 for Scissors: ");
            int userChoice = scan.nextInt();
            
            String computerMove = "";
            if (computerChoice == 1) {
                computerMove = "Rock";
            } else if (computerChoice == 2) {
                computerMove = "Paper";
            } else if (computerChoice == 3) {
                computerMove = "Scissors";
            }
            
            System.out.println("Round " + round + ":");
            switch (userChoice) {
                case 1:
                    if (computerChoice == 2) {
                        System.out.println("I choose... PAPER!! I win that round XD");
                    } else if (computerChoice == 1) {
                        System.out.println("Seems we chose the same thing :-)");
                    } else {
                        System.out.println("I choose... " + computerMove + "! You win, dang it!");
                    }
                    break;
                case 2:
                    if (computerChoice == 3) {
                        System.out.println("I choose... SCISSORS!! I win that round XD");
                    } else if (computerChoice == 2) {
                        System.out.println("Seems we chose the same thing :-)");
                    } else {
                        System.out.println("I choose... " + computerMove + "! You win, dang it!");
                    }
                    break;
                case 3:
                    if (computerChoice == 1) {
                        System.out.println("I choose... ROCK!! I win that round XD");
                    } else if (computerChoice == 3) {
                        System.out.println("Seems we chose the same thing :-)");
                    } else {
                        System.out.println("I choose... " + computerMove + "! You win, dang it!");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                    break;
            }
        }
        
        scan.close();
    }
}
