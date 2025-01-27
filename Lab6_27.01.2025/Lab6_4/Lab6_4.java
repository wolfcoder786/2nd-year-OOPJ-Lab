
interface Motor{
    int capacity  = 10;
    void run();
    void consume();
}
class WashingMachine implements Motor{
    public void run(){
        System.out.println("Washing Machine is running");
    }
    public void consume(){
        System.out.println("Washing Machine is consuming");
    }
}
public class Lab6_4 {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine();
        washingMachine . run();
        washingMachine.consume();
        System.out.println("Capacity :"+Motor.capacity+"liters");


    }
}
