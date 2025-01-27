

import java.util.Scanner;

interface Employee{
    void getDetails();
}
interface Manager extends Employee{
    void getDeptDetails();
}
class Head implements Manager{
    private int empId;
    private String Ename ;
    private int deptId;
    private String deptName;
    
    Head(int empId , String Ename , int deptId , String deptName){
        this.empId = empId;
        this.Ename = Ename ;
        this.deptId  = deptId ;
        this.deptName = deptName ;

    }
    public void getDetails(){
        System.out.println("Employee id - " + empId);
        System.out.println("Employee name - " + Ename);
    }
    public void getDeptDetails(){
        System.out.println("Department id - " + deptId);
        System.out.println("Department name - " + deptName);
    }
}
public class Lab6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee id:");
        int empId = sc.nextInt();
        System.out.println("Enter Employee name:");
        String Ename = sc.next();
        System.out.println("Enter Department id:");
        int deptId = sc.nextInt();
        System.out.println("Enter Department name:");
        String deptName = sc.next();
        Head head = new Head(empId, Ename, deptId, deptName);
        head.getDetails();
        head.getDeptDetails();
    }
    
}
