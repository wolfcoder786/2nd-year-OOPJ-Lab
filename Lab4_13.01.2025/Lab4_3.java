// Program on use of Super Keyword 
class Parent{
    void display(){
        System.out.println("This is Parent Class");
    }
}
class Child extends Parent{
    void display(){
        // calling the parent super class by super keyword invoking 
        super.display();
        System.out.println("This is child Class");
    }
}
public class Lab4_3 {
    public static void main(String[] args) {
        Child obj  = new Child();
        obj.display();
    }
}
