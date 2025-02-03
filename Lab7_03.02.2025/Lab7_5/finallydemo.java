// Program on Finally block
public class finallydemo {
    public static void main(String[] args) {
        try {
            int a = 10 ;
            int b = 0 ;
            int c = a/b ;
            System.out.println("Result :"+c);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("Exception caught : Arithmetic Exception");

        }finally{
            System.out.println("Execution completed");
        }
    }
}
