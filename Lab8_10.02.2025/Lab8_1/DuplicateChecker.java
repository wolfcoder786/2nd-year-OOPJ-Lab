import java.util.*;

// Custom exception for duplicate numbers
class DuplicateNumberException extends Exception {
    public DuplicateNumberException(String message) {
        super(message);
    }
}

public class DuplicateChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter the number of elements: ");
            int n = scanner.nextInt();
            int[] numbers = new int[n];
            
            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                int num = scanner.nextInt();
                
                // Check for duplicates using insertion method
                for (int j = 0; j < i; j++) {
                    if (numbers[j] == num) {
                        throw new DuplicateNumberException("Duplicate number found: " + num);
                    }
                }
                
                numbers[i] = num;
            }
            
            System.out.print("No duplicates found. List: ");
            for (int i = 0; i < n; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
            
        } catch (DuplicateNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter only integers.");
        } finally {
            scanner.close();
            System.out.println("Execution completed.");
        }
    }
}
