package mypackage;

public class main {
    public static void main(String[] args) {
        AccessSpecifierExample example = new AccessSpecifierExample();

        // Access public members
        System.out.println(example.publicField);
        example.publicMethod();

        // Access protected members
        System.out.println(example.protectedField);
        example.protectedMethod();

        // Access default members
        System.out.println(example.defaultField);
        example.defaultMethod();

        // Private members are not accessible outside the class
        // Uncommenting these lines will result in a compilation error
        // System.out.println(example.privateField);
        // example.privateMethod();

        // Access private members via a public method in the same class
        example.showAccess();
    }
}
