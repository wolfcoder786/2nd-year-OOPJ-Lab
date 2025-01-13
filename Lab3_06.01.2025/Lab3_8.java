// Program on static block
public class Lab3_8 {

    // Static variable
    static int count;
    static String message;

    // Static block
    static {
        System.out.println("Static block is executed.");
        count = 100; // Initializing static variable
        message = "Hello, Static Block!";
    }

    public static void main(String[] args) {
        System.out.println("Main method is executed.");
        System.out.println("Count: " + count);
        System.out.println("Message: " + message);
    }
}
