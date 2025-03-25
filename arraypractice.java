
import java.util.Arrays;
public class arraypractice {
    public static void main(String[] args) {
        String[] cars = {"bmw", "lexus", "neon", "benz"};
        int[] numberarray = {1, 2, 4, 7, 9, 11};
        
        cars[2] = "buggati";

        numberarray[2] = 3;


        System.out.println(cars[2]);
        System.out.println(numberarray[2]);
        System.out.println(numberarray.length);
        System.out.println(numberarray[5]);

        for (String i : cars) {
            System.out.println(i);
        }

        for (int j = 0; j < numberarray.length; j++) {
            System.out.println(numberarray[j]);
        }  
    }
}