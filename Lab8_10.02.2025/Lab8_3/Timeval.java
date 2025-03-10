import java.util.Scanner;

class HrsException extends Exception {
    public HrsException(String m) {
        super(m);
    }
}

class MinException extends Exception {
    public MinException(String m) {
        super(m);
    }
}

class SecException extends Exception {
    public SecException(String m) {
        super(m);
    }
}

class Time {
    private int hours, min, sec;

    // Remove static keyword to use instance variables
    public void Timeset(int hours, int min, int sec) throws HrsException, MinException, SecException {
        if (hours < 0 || hours > 23) {
            throw new HrsException("Invalid hours");
        }
        if (min < 0 || min > 59) {
            throw new MinException("Invalid minutes");
        }
        if (sec < 0 || sec > 59) {
            throw new SecException("Invalid seconds");
        }

        // Assign values to instance variables if validation passes
        this.hours = hours;
        this.min = min;
        this.sec = sec;
    }

    public void displayTime() {
        System.out.println("Correct Time -> " + String.format("%02d:%02d:%02d", hours, min, sec));
    }
}

public class Timeval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Time");
        System.out.print("Enter the hours: ");
        int hours = sc.nextInt();
        System.out.print("Enter the minutes: ");
        int minutes = sc.nextInt();
        System.out.print("Enter the seconds: ");
        int seconds = sc.nextInt();

        Time time = new Time();
        try {
            time.Timeset(hours, minutes, seconds);
            time.displayTime();
        } catch (HrsException | MinException | SecException e) {
            System.out.println("Exception found: " + e.getMessage());
        }

        sc.close();
    }
}
