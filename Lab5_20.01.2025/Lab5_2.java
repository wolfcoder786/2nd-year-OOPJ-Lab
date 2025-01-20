// Define an abstract Bank class having a method as getRateOfInterest(). Create two classes SBI and PNB which extend Bank class and implement the getRateOfInterest method.
// Input mentioned in the program
// Output The rate of interest of the bank is ---
abstract class Bank {
    public abstract double getRateOfInterest();
}
class Sbi extends Bank {
    public double getRateOfInterest() {
        // System.out.println("The Rate of Interest is 7.40");
        return 7.5;
    }
}
class Pnb extends Bank {
    public double getRateOfInterest() {
       return 7.9;
    }
}
public class Lab5_2 {
    public static void main(String[] args) {
        Bank sbi = new Sbi();
        Bank pnb = new Pnb();
        System.out.println("The Rate of Interest of Sbi :"+sbi.getRateOfInterest());
        System.out.println("The Rate of Interest of Pnb :"+pnb.getRateOfInterest());
        
    }
}
