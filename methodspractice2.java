public class methodspractice2 {
    public static void main(String[] args) {
       
        
        int x = 5;
        int y = 6;

        hello();
        System.out.println(multiplication(x, y));
    }

    static void hello(){
        String greet = "hello world";
        System.out.println(greet);
    }

    static int multiplication(int x, int y){
        int multiply = x * y;
       return multiply;

    }
}
