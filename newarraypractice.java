
public class newarraypractice {
    public static void main(String[] args) {
    
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("how many values do you want? ");

        int size = input.nextInt();

        Double [] myList = new Double [size];

        // System.out.print("Enter " + myList.length + " values");

        for (int i = 0; i < myList.length; i++) {
            //myList[i] = input.nextDouble();
            myList[i] = Math.random() * 100;
        }

        //printing

        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }

        //summation

        double total = 0;

        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }

        System.out.println("\nTotal = " + total);


        //finding max value
        double max = myList[0];

        for (int i = 0; i < myList.length; i++) {
            if (myList[i] > max) {
                max = myList[i];
            }
        }

        System.out.print("Your max value is " + max);
    }
}
