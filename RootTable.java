import java.util.Scanner;

public class RootTable {

    public static void main(String[] args) {
        // INPUT SECTION
        Scanner scanner = new Scanner(System.in); // Create Scanner object for input

        System.out.println("Enter five numbers separated by a space:");
        String inputLine = scanner.nextLine(); // Read the entire line of input

        String[] tokens = inputLine.trim().split("\\s+"); // Split input into tokens
        double[] numbers = new double[5]; // Array to store the five numbers

        // PROCESSING SECTION
        for (int i = 0; i < 5; i++) {
            numbers[i] = Double.parseDouble(tokens[i]); // Convert each token to double
        }

        // OUTPUT SECTION
        System.out.printf("%-10s%-20s%-20s%n", "Number", "Square Root", "Cube Root");
        for (double num : numbers) {
            double squareRoot = Math.sqrt(num); // Calculate square root
            double cubeRoot = Math.cbrt(num);   // Calculate cube root

            /* Output each row with formatted values */
            System.out.printf("%-10.0f%-20.3f%-20.3f%n", num, squareRoot, cubeRoot);
        }

        scanner.close(); // Close the scanner
    }
}