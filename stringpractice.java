public class stringpractice {
    public static void main(String[] args) {
        String name = "mississippy";
        int i = 0;

        while (i < 12) {
            if (name.contains("s")) {
                i++;
                int count = i++;
                System.out.println(count);
            } else{
                break;
            }
        }
    }
}
