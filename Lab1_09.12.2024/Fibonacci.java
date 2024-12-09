
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        
        System.out.print("Enter the number of terms: ");
        int term = sc.nextInt();
        
        int a = 0, b = 1, c = 0;
        
        System.out.println("\nFibonacci Series up to " + term + " terms:");
        
        for (int i =0 ; i <= term; i++) {
            System.out.print(a + " "); // Print the current term
            c = a + b; // Calculate next term
            a = b; 
            b = c; 
        }
        
        // System.out.println("\n\nThe " + term + "th Fibonacci number is: " + a); 
        
        sc.close();
    }
}
