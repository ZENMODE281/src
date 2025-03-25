
public class overloadingmethods {
    public static void main(String[] args) {
       
        

        int addition = add(1, 3);

        System.out.println(addition);

       
    }

    static int add(int a, int b){

        
        int solution = a + b;

        System.out.println("this is solution 1 ");
        return solution;
    }


    static int add(int a, int b, int c){

        int solution2 = a + b + c;

        System.out.println("this is solution 2 ");
        return solution2;
    }

    
}


// overloading methods