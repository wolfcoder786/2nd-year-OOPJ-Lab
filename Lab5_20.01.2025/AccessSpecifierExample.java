package mypackage;

// Class demonstrating all access specifiers
public class AccessSpecifierExample {
    public String publicField = "Public Field";
    private String privateField = "Private Field";
    protected String protectedField = "Protected Field";
    String defaultField = "Default Field"; // default access

    // Public method
    public void publicMethod() {
        System.out.println("This is a Public Method");
    }

    // Private method
    private void privateMethod() {
        System.out.println("This is a Private Method");
    }

    // Protected method
    protected void protectedMethod() {
        System.out.println("This is a Protected Method");
    }

    // Default method
    void defaultMethod() {
        System.out.println("This is a Default Method");
    }

    // Method to demonstrate access within the same class
    public void showAccess() {
        System.out.println(privateField);
        privateMethod(); // Private members accessible within the same class
    }
}
