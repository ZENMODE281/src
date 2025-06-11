import java.util.Random;
import java.util.Scanner;

public class assignment1c {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        double power = Math.pow(0, 2.0);

       


        //randomising the height and base
        
            
        double height = rand.nextDouble() * 6;

        double width = rand.nextDouble() * 6;

            

        // solving the hypotenuse


        System.out.println( String.format("Your height for this turn is %.3f and your width is %.3f", height, width));

        System.out.println("hang on while i solve the equation");


        double hypotenuse = Math.sqrt( Math.pow(height, 2.0) + Math.pow(width, 2.0));

        System.out.println(String.format("Your hypotenuse is %.3f", hypotenuse));


            
           
            
        scan.close();
        
    }
}


// hypotenuse = square root of height square + base square;