// Wap to calc amount you spend in reliance ,if your expenditure is more than 25000 then discount is 15% otherwise it is 10%
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Expenditure:");
        int expenditure = sc.nextInt();
        double discount;
        if (expenditure>25000) {
             discount = 0.15;

        }
        else{
             discount = 0.10;

        }
        double discountAmount = expenditure * discount ;
        double finalAmount = expenditure - discountAmount;
        System.out.println("Discount is "+discount);
        System.out.println("Discount Amount:"+discountAmount);
        System.out.println("Final Amount :"+finalAmount);
        sc.close();
    }
    
}
