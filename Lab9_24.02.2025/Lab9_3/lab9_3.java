import java.io.FileInputStream;
import java.io.IOException;

public class lab9_3 {
    // Method to compare two binary files
    public static void compareBinaryFiles(String file1, String file2) throws IOException {
        try (FileInputStream fis1 = new FileInputStream(file1); 
             FileInputStream fis2 = new FileInputStream(file2)) {
             
            int pos = 0, byte1, byte2;

            // Read bytes from both files simultaneously
            while ((byte1 = fis1.read()) != -1 && (byte2 = fis2.read()) != -1) {
                if (byte1 != byte2) {
                    System.out.println("Files differ at byte position: " + pos);
                    return;
                }
                pos++;
            }

            // Check if both files reached the end
            if (fis1.read() != -1 || fis2.read() != -1) {
                System.out.println("Files differ in size.");
            } else {
                System.out.println("Files are identical.");
            }
        }
    }

    // Main method to run the comparison
    public static void main(String[] args) {
        try {
            compareBinaryFiles("file1.txt", "file2.txt");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
