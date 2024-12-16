// Display the element on an array using for each loop. The array 	value shall be taken from keyboard.

import java.util.Scanner;

public class Lab2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element"+i+":");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        sc.close();
    }
}
