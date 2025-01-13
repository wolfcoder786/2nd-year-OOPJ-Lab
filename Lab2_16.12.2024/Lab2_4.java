// 4. WAP in java which will accept N numbers from command line argument and will display the total number of even, total 	number of odd, sum of even, sum of odd and the GRAND TOTAL

import java.util.Scanner;

public class Lab2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element"+i+":");
            arr[i] =sc.nextInt();

        }
        int evenCount = 0 ;
        int oddcount = 0 ;
        int evenSum = 0 ;
        int oddSum = 0 ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 == 0) {
                evenCount++;
                evenSum +=arr[i];
            }else{
                oddcount++;
                oddSum +=arr[i];
            }
        }
        System.out.println("Number of even Number:"+evenCount);
        System.out.println("Number of odd Number:"+oddcount);
        System.out.println("Sum of even Number:"+evenSum);
        System.out.println("Sum of odd Number:"+oddSum);
        
        sc.close();
    }
}
