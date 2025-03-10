import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        // Taking the first string as a command-line argument
        String str1 = args[0]; // Expected: "Welcome "

        // Taking the second string using Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine(); // Expected: "Back to India"

        // Concatenating both strings
        String concatenatedString = str1 + str2;
        System.out.println("Concatenated String: " + concatenatedString);

        // Splitting the concatenated string into 4 parts
        String[] parts = concatenatedString.split(" ", 4);

        // Displaying all 4 strings
        for (int i = 0; i < parts.length; i++) {
            System.out.println("Part " + (i + 1) + ": " + parts[i]);
        }

        scanner.close();
    }
}
