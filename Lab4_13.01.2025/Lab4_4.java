// Program on initialization of superclass  constructor through child class constructor using super Keyword
class SuperClass{
    SuperClass(){
        System.out.println("SuperClass Constructor");
    }
}
class SubClass extends SuperClass{
    SubClass(){
        super();//Calling the superclass
        System.out.println("SubClass Constructor");
    }
}
public class Lab4_4 {
    public static void main(String[] args) {
        SubClass subclass  = new SubClass();
      
    }
}
