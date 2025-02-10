public class Length {
    private int feet;
    private int inches;

    // Constructor to initialize feet and inches
    public Length(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
        normalize();
    }

    // Method to normalize inches (convert excess inches to feet)
    private void normalize() {
        if (inches >= 12) {
            feet += inches / 12;
            inches = inches % 12;
        } else if (inches < 0) {
            int borrow = (Math.abs(inches) / 12) + 1;
            feet -= borrow;
            inches += borrow * 12;
        }
    }

    // Method to add two Length objects
    public Length add(Length other) {
        return new Length(this.feet + other.feet, this.inches + other.inches);
    }

    // Method to subtract two Length objects
    public Length subtract(Length other) {
        return new Length(this.feet - other.feet, this.inches - other.inches);
    }

    // Method to display the length
    public void display() {
        System.out.println(feet + " feet " + inches + " inches");
    }

    public static void main(String[] args) {
        Length length1 = new Length(10, 2);
        Length length2 = new Length(2, 8);

        // Adding two lengths
        Length sum = length1.add(length2);
        System.out.print("Sum: ");
        sum.display();

        // Subtracting two lengths
        Length difference = length1.subtract(length2);
        System.out.print("Difference: ");
        difference.display();
    }
}
