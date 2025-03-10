// Write a Java program that reads a list of integers from the user and throws an 		exception if any numbers are duplicates and the exception is handled by 	try,catch 	and finally block. 

import java.util.InputMismatchException;
import java.util.Scanner;

class DuplicateException extends Exception{
    public DuplicateException(String m){
        super(m);
    }
}
public class userdefined_1 {
    public static void main(String[] args) {
        try {
            Scanner sc  = new Scanner(System.in);
            System.out.println("Enter the size of the array:");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements of the array:");
            for(int i=0;i<n;i++){
                System.out.print("Enter element "+(i+1)+": ");
                arr[i] = sc.nextInt();
            }
            //printing the array
            System.out.println("The array is:");
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            //checking for duplicates
            for (int i = 0; i < arr.length; i++) {
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[i]==arr[j]) {
                        throw new DuplicateException("Duplicate number found: "+arr[i]);
                        
                    }
                }
            }
        } catch (DuplicateException e) {
            // TODO: handle exception
        System.out.println("Exception:"+e.getMessage());
        }catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter only integers.");
        } finally {
            System.out.println("Execution completed.");
        }

    }
}
