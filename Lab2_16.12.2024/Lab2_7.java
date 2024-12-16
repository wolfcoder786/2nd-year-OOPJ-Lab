// 7. Program on two dimensional array, the program will accept the 	size of row and column from the keyboard and the value also 	from the keyboard the output will be displayed in 2D matrix form.

import java.util.Scanner;

public class Lab2_7 {
    public static void main(String[] args) {
        int row , col , i , j ;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        row = sc.nextInt();
        System.out.println("Enter the number of columns");
        col = sc.nextInt();
        int[][] arr = new int[row][col];
        for ( i = 0; i < row; i++) {
            for ( j = 0; j  <col; j++) {
                System.out.println("Enter element["+i+"]"+"["+j+"]:");
                arr[i][j] = sc.nextInt();

            }
        }
        for ( i = 0; i < row; i++) {
            for ( j = 0; j  <col; j++) {
                System.out.print(arr[i][j]+"\t");
                
            }
            System.out.print("\n");
        }
    }
}
