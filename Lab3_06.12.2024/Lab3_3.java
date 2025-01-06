// Write a program to print the coressponding grade for the given mark using if else  statement in  java

import java.util.Scanner;

public class Lab3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mark");
        int mark  = sc .nextInt();

        if (mark>=90&& mark<=100) {
            System.out.println("Grade:O");
        }else if (mark>=80 && mark<90) {
            System.out.println("Grade:E");
        }
        else if (mark>=70 && mark<80) {
            System.out.println("Grade:A");
        }
        else if (mark>=60 && mark<70) {
            System.out.println("Grade:B");
        }
        else if (mark>=50 && mark<60) {
            System.out.println("Grade:C");
        }
        else if (mark>=40 && mark<50) {
            System.out.println("Grade:D");

        }
        else if (mark<40) {
            System.out.println("Grade:F");
        }
        else{
            System.out.println("Invalid");
        }
        sc.close();
    }
}
