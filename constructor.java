public class constructor {
    public static void main(String[] args) {
       String name = "My name is Naseef";

       String revers = new StringBuilder(name).reverse().toString();

       System.out.println(revers);
    }
}
