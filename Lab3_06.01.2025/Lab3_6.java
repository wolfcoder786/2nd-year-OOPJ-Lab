// program on static method()
public class Lab3_6 {
        // Static method
        public static int addNumbers(int a, int b) {
            return a + b;
        }
    
        public static void main(String[] args) {
            // Calling the static method without creating an object
            int result = Lab3_6.addNumbers(10, 20);
            
            // Printing the result
            System.out.println("The sum of 10 and 20 is: " + result);
        }
    
    
}
