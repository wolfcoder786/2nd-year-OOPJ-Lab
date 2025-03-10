import java.io.*;

public class Lab9_2 {

    public static void copyFileUsingCharacterStream(String source, String destination) throws IOException {
        try (FileReader fr = new FileReader(source); FileWriter fw = new FileWriter(destination)) {
            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }
            System.out.println("File copied using character stream.");
        }
    }

    public static void copyFileUsingByteStream(String source, String destination) throws IOException {
        try (FileInputStream fis = new FileInputStream(source); FileOutputStream fos = new FileOutputStream(destination)) {
            int ch;
            while ((ch = fis.read()) != -1) {
                fos.write(ch);
            }
            System.out.println("File copied using byte stream.");
        }
    }

    public static void main(String[] args) {
        try {
            copyFileUsingCharacterStream("file.txt", "File_new.txt");
            copyFileUsingByteStream("file.txt", "file3.txt");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
