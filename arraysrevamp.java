public class arraysrevamp {
    public static void main(String[] args) {
        

        int[] numbers = {1, 2, 3, 4, 5};

        numbers[1] = 7;


        System.out.println(numbers[1]);

        System.out.println(numbers.length);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }


        //prints every value of the array
        for(int i : numbers){
            System.out.println(i);
        }
    }
}

