// 1. WAP in java which will accept your name age, Salary from the keyboard using scanner class and display on the screen.

import java.util.Scanner;

public class Lab2_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name = sc.nextLine();
        System.out.println("Enter Your Age:");;
        int age = sc.nextInt();
        System.out.println("Enter Your Salary:");
        double salary = sc.nextDouble();
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Salary:"+salary);
        sc.close();

}
}