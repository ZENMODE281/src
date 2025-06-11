import java.util.Scanner;

public class task {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("How many marks do you want to input?");
    int arraylength = scan.nextInt();

    int[] array = new int[arraylength];


    int maxValue = array[0];
    int maxIndex = 0;
    int total = 0;
    System.out.println("Enter your values");
    for (int i = 0; i < array.length; i++) {
        array[i] = scan.nextInt();
    }

    for (int i = 0; i < array.length; i++) {  
        if (array[i] > maxValue) {
            maxValue = array[i];
            maxIndex = i;
        } 

    }


    for ( int value : array){
        total += value;
    }

    
    System.out.println("The highest value is " + maxIndex + " \n while the total is " + total);
    
    scan.close();
  }  


  
}
