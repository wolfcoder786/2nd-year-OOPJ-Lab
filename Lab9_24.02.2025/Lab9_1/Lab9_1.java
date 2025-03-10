import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Lab9_1 {
  public static void StudentDetails() throws IOException{
    Scanner sc  = new Scanner(System.in);
    System.out.println("Enter the name of the student: ");
    String name = sc.nextLine();
    System.out.println("Enter Roll no:");
    String roll = sc.nextLine();
    System.out.println("Enter the subject:");
    String subject = sc.nextLine();
    System.out.println("Enter the marks of the student:");
    String marks = sc.nextLine();
    String data = roll + "," + name + "," + subject + "," + marks + "\n";
    try(FileOutputStream fos = new FileOutputStream("Student.txt")){
        fos.write(data.getBytes());
        System.out.println("Data written successfully");

    }
    try(FileInputStream fis = new FileInputStream("Student.txt")){
        System.out.println("Reading ...");
        int ch ;
        while ((ch = fis.read())!=-1) {
            System.out.println((char)ch);
        }
    }
  }
  public static void main(String[] args) throws IOException {
    StudentDetails();
}
}
