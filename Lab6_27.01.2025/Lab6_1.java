
interface Employees{
    double Earning();
    double deductions();
    double bonus();
}

class Manager implements Employees {
    protected double Basic ;
    Manager(double Basic){
        this.Basic = Basic ;

    }
    
    public double Earning(){
        return Basic + (0.8*Basic) + (0.15*Basic);

    }
    public double deductions(){
        return 0.12* Basic ;

    }
    public double bonus(){
        return 0 ;
    }

}
class Substaff extends Manager {
    Substaff(double Basic){
        super(Basic);
    }
    public double bonus(){
        return 0.5 * Basic;
    }
}

public class Lab6_1 {

    public static void main(String[] args) {
        int Basic = 50000;

        Substaff substaff  = new Substaff(Basic);

        double earnings  = substaff.Earning();
        double deductions = substaff.deductions();
        double bonus = substaff.bonus();
        System.out.print("Earnings :"+earnings);
        System.out.print("\nDeductions :"+deductions);
        System.out.print("\nBonus :"+bonus);

    }
}