interface MyInterface {
    void interfaceMethod();
}

// Implementing class
class ChildClass implements MyInterface {
    public void interfaceMethod() {
        System.out.println("Interface method implemented in ChildClass");
    }

    public void childMethod() {
        System.out.println("Child class specific method");
    }
}
public class lab6_5 {

    public static void main(String[] args) {
     MyInterface obj = new ChildClass();
     obj.interfaceMethod();
     
    } 
}