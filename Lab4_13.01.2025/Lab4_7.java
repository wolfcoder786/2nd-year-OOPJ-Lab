    // Parent class
    class Apple {
        // Method to be overridden
        void show() {
            System.out.println("This is the show method of Apple class.");
        }
    }
    
    // Child class Banana inheriting Apple
    class Banana extends Apple {
        // Overriding the show method
        @Override
        void show() {
            System.out.println("This is the show method of Banana class.");
        }
    }
    
    // Child class Cherry inheriting Apple
    class Cherry extends Apple {
        // Overriding the show method
        @Override
        void show() {
            System.out.println("This is the show method of Cherry class.");
        }
    }
public class Lab4_7 {
    public static void main(String[] args) {
        // Dynamic Method Dispatch
        Apple ref;

        // Creating Apple object and referencing it
        ref = new Apple();
        ref.show(); // Calls Apple class method

        // Creating Banana object and referencing it
        ref = new Banana();
        ref.show(); // Calls Banana class method

        // Creating Cherry object and referencing it
        ref = new Cherry();
        ref.show(); // Calls Cherry class method
    }

}
