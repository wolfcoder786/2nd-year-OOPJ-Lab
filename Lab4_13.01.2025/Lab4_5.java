// A Plastic manufacturer sells plastic in different shapes like 2D sheet and 3D box. The cost of sheet is Rs 40/ per square ft. and the cost of box is Rs 60/ per cubic ft. Implement it in Java to calculate the cost of plastic as per the dimensions given by the user where 3D inherits from 2D.
// Input: Enter dimensions
// Output: Display the cost of plastic

import java.util.Scanner;

class twoD{
    double length, width ;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length:");
         length = sc.nextDouble();
         System.out.print("Enter Width:");
         width  = sc.nextDouble();
    }
    double CalculateCost(){
        // System.out.println("Total 2D Cost: ");
        return length * width * 40 ;
    }
    
}
class ThreeD extends twoD{
    double height ;
    void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Height:");
        height = sc.nextDouble();

    }
    double CalculateCost(){
        // System.out.println("Total 3D Cost: ");
        return length * width *height*60 ;
    }
}
public class Lab4_5 {
    public static void main(String[] args) {
        //Checking 2d class
        // twoD obj = new twoD();
        // obj.input();
        // double cost = obj.CalculateCost();
        // System.out.print("Cost:"+cost);
        // 3d Class
        ThreeD obj = new ThreeD();
        obj.input();
        double cost = obj.CalculateCost();
        System.out.println("The Cost of making the box(3D) :"+cost);
    }
}
