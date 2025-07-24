public class substring {
    public static void main(String[] args) {
        
        String emailaddress = "test234@gmail.com";
        String newstring = emailaddress.substring(0, 6);

        System.out.println("This is the original " + emailaddress);
        System.out.println("This is the substring " + newstring);
    }
}
