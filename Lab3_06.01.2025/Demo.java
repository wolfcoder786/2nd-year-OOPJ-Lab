// Write a class file - box with three data members (length, width, height) and a method volume(). Also implement the application class Demo where an object of the box class is created with user entered dimensions and volume is printed.
import java.util.Scanner;

// Box class
class Box {
    private double length;
    private double width;
    private double height;

    // Constructor to initialize dimensions
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Method to calculate volume
    public double volume() {
        return length * width * height;
    }
}

// Demo class
public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get dimensions from user
        System.out.print("Enter the length of the box: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the box: ");
        double width = scanner.nextDouble();

        System.out.print("Enter the height of the box: ");
        double height = scanner.nextDouble();

        // Create a Box object
        Box box = new Box(length, width, height);

        // Print the volume
        System.out.println("The volume of the box is: " + box.volume());

        scanner.close();
    }
}

