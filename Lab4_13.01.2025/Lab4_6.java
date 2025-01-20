// 6.Illustrate the execution of constructors in multi-level inheritance with three Java classes plate(length, width), box(length, width, height), wood box (length, width, height, thick) where box inherits from plate and woodbox inherits from box class. Each class has constructor where dimensions are taken from user.
// Input: Enter the dimensions
// Output: Display the dimensions accordingly
import java.util.Scanner;
class Plate{
    double length , width ;
    Plate(double length , double width){
        this.length = length;
        this.width = width;
        System.out.println("The length of Plate:"+length);
        System.out.println("The width of Plate:"+width);
    }
}

 class box extends Plate{
    double height ;
    box(double length , double width , double height){
        super(length, width);
        this.height = height ;

    }

    
}
// WoodBox class inheriting Box
class WoodBox extends Box {
    double thickness;

    // Constructor
    WoodBox(double length, double width, double height, double thickness) {
        super(length, width, height); // Call the constructor of Box
        this.thickness = thickness;
        System.out.println("WoodBox Constructor: Thickness = " + thickness);
    }
}

public class Lab4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions
        System.out.print("Enter Length: ");
        double length = sc.nextDouble();
        System.out.print("Enter Width: ");
        double width = sc.nextDouble();
        System.out.print("Enter Height: ");
        double height = sc.nextDouble();
        System.out.print("Enter Thickness: ");
        double thickness = sc.nextDouble();

        // Create WoodBox object
        WoodBox woodBox = new WoodBox(length, width, height, thickness);

        // Display dimensions
        System.out.println("Dimensions:");
        System.out.println("Length = " + woodBox.length);
        System.out.println("Width = " + woodBox.width);
        System.out.println("Height = " + woodBox.height);
        System.out.println("Thickness = " + woodBox.thickness);

        sc.close();
    }
}
