public class Stringmethods {
    public static void main(String[] args) {
        String name = "naseef";

        int length = name.length();

        char letter = name.charAt(3);

        int index = name.indexOf("e");

        name = name.trim();

        name = name.toUpperCase();

        name = name.replace("E", "o");

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(name);
        System.out.println(name.isEmpty());

        if (name.isEmpty()) {
            System.out.println("Your name cannot be empty");
        } else{
            System.out.println("Hello " + name);
        }

        if (name.contains(" ")) {
            System.out.println("Your name has a space in it");
        } else{
            System.out.println("Your name does not have space in it");
        }
    }
}
