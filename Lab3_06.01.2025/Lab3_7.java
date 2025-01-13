import java.util.Scanner;

public class Lab3_7 {
    static int a = m1();
    static {
        System.out.println("Inside static block");
    }
    public static int m1(){
        System.out.println("from m1");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        return n ;
    }

    public static void main(String[] args) {
        System.out.println("The Value of a "+a);
        System.out.println("Inside Main");


    }
}
