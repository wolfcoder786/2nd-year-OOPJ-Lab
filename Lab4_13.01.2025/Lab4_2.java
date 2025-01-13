final class FinalClass {
    final int finalVariable = 10 ;
    final void finalMethod(){
        System.out.println("This is a final method");
    }
    
}
public class Lab4_2 {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        System.out.println("Final Variable :"+obj.finalVariable);
        obj.finalMethod();
    }
}
