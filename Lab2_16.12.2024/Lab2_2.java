// 2. Write a program to print the corresponding grade for the given 	mark using if..else statement in Java

import java.util.Scanner;

public class Lab2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Section
        System.out.println("Enter your Marks:");
        int marks = sc.nextInt();

        // Validation for invalid marks
        if (marks > 100 || marks < 0) {
            System.out.println("Invalid Marks. Marks should be between 0 and 100.");
        } 
        else if (marks >= 90) {
            System.out.println("Grade: O");
        } 
        else if (marks >= 80) {
            System.out.println("Grade: E");
        } 
        else if (marks >= 70) {
            System.out.println("Grade: A");
        } 
        else if (marks >= 60) {
            System.out.println("Grade: B");
        } 
        else if (marks >= 50) {
            System.out.println("Grade: C");
        } 
        else if (marks >= 40) {
            System.out.println("Grade: D");
        } 
        else {
            System.out.println("Grade: F");
        }

        sc.close();
    }
}
