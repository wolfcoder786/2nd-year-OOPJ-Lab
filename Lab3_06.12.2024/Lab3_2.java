// Find the largest among 3 user entered number at the command prompt using java
import java.util.Scanner;
public class Lab3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 :");
        int num1 = sc.nextInt();
        System.out.print("Enter num2 :");
        int num2 = sc.nextInt();
        System.out.print("Enter num3 :");
        int num3 = sc.nextInt();
        
        int largest ;
        if (num1>=num2 && num1 >= num3) {
            largest = num1 ;
        }else if (num2>=num1 && num2 >= num3) {
            largest = num2 ;
        }else{
            largest = num3 ;
        }
        System.out.println("Largest of 3 numbers:"+largest);
        sc.close();
        

    }
}
