import java.util.Scanner;

public class catchblocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter number:");
            int num = sc.nextInt();
            if (99%num == 0) {
                System.out.println("99 is divisible by " + num);
            }
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("Exception caught : Arithmetic Exception");
        }catch(NumberFormatException e){
            System.out.println("Exception caught : Number Format Exception");
        }finally{
            System.out.println("Execution Completed");
        }
    }
}
