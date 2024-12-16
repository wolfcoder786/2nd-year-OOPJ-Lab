
// 5. WAP in java which will accept the mark of 3 subject and print the corresponding grade for the given mark using if..else 	statement in java.  Also use separate function for accceptDetails() and displayDetails(). Use InputStreamReader and BufferedReader class
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// import javax.naming.InterruptedNamingException;
public class Lab2_5 {
    public static void main(String[] args) throws IOException {
        int[] subject = accceptDetails();
        displayDetails(subject);
    }

    public static int[] accceptDetails() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] subject = new int[3];

        System.out.println("Enter the marks of three subjects");
        for (int i = 0; i < subject.length; i++) {
            System.out.print("Subject" + (i + 1) + ":");
            subject[i] = Integer.parseInt(reader.readLine());
        }
        return subject;
    }

    public static void displayDetails(int[] marks) {
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Marks for Subject " + (i + 1) + ": " + marks[i]);
            String grade;

            if (marks[i] >= 90) {
                grade = "O";
            } else if (marks[i] >= 80) {
                grade = "A";
            } else if (marks[i] >= 70) {
                grade = "B";
            } else if (marks[i] >= 60) {
                grade = "C";
            } else if (marks[i] >= 50) {
                grade = "D";
            } else {
                grade = "F";
            }

            System.out.println("Grade for Subject " + (i + 1) + ": " + grade);
        }
    }
}
