public class ArithmeticExceptionDemo {
public static void main(String[] args) {
    try{
        int a = 100 ;
        int b = 0 ;
        int c = a/b ; //throws exception
        System.out.println("Result :"+c);

    }catch(ArithmeticException e){
    System.out.println("Exception caught : Division by zero ");
}finally{
    System.out.println("Excecution completed");
}
}
}
