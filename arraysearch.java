
import java.util.Scanner;

public class arraysearch {
    public static void main(String[] args) {
        int [] lol = {1, 2, 3, 4, 5, 6};
        
        Scanner scan = new Scanner(System.in);

        System.out.println("please enter your key");

        int key = scan.nextInt();
    }

    public static int search(int[] lol, int key){
        for (int index = 0; index < lol.length; index++) {
            if (key == lol[index]) {
                return index;
            }

            
        }
        return -1;
    }
}
