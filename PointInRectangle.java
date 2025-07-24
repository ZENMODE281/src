import java.util.Scanner;

public class PointInRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        //boundaries
        double minX = -5.0;
        double maxX = 5.0;
        double minY = -2.5;
        double maxY = 2.5;

        
        boolean isInside = (x >= minX && x <= maxX) && (y >= minY && y <= maxY);

        if (isInside) {
            System.out.println("Point (" + x + ", " + y + ") is in the rectangle");
        } else {
            System.out.println("Point (" + x + ", " + y + ") is not in the rectangle");
        }

        input.close();
    }
}