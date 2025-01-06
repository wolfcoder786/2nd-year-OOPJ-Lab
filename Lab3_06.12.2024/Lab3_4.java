// Swap numbers using bitwise operator

import java.util.Scanner;

public class Lab3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        a = a ^ b ;
        b = a ^ b ;
        a = a ^ b ;
        System.out.println("First number after swapping: "+a);
        System.out.println("Second number after swapping: "+b);
        
    }

}
