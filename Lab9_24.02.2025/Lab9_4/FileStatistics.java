import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the path to the text file: ");
        String fileName = scanner.nextLine();
        scanner.close();
        
        try {
            int charCount = 0;
            int wordCount = 0;
            int lineCount = 0;
            
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            
            while ((line = reader.readLine()) != null) {
                lineCount++;
                
                if (!line.isEmpty()) {
                    // Count characters (including whitespace)
                    charCount += line.length();
                    
                    // Count words
                    String[] words = line.split("\\s+");
                    wordCount += words.length;
                }
                
                // Add 1 for the newline character (except for the last line)
                // This ensures consistent character count with most text editors
                if (reader.ready()) {
                    charCount++;
                }
            }
            
            reader.close();
            
            System.out.println("\nFile Statistics for: " + fileName);
            System.out.println("Number of characters: " + charCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of lines: " + lineCount);
            
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}