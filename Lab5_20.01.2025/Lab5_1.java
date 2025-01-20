// 1.Crate an abstract class 'student' with two data members roll no, reg no, a method getinput() and an abstract method course(). A subclass 'kiitian' with course() method implementation. Write the driver class to print the all details of a kiitian object.
// Input -  Rollno 2205180 
// Registration no 1234567890
// Output -Rollno 2205180 
// Registration no 1234567890
// Course B.Tech. (Computer Science & Engg)

import java.util.Scanner;

abstract class Student {
    int rollno;
    long regno;
    public void getinput(int rollno , long regno){
        this.rollno = rollno ;
        this.regno = regno;

    }
    public abstract String Course();
    
    
}
class kiitian extends Student{
public String Course(){
    return "B.Tech. (Computer Science & Engg)";
}
}
public class Lab5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rollno:");
        int rollno = sc.nextInt();
        System.out.print("Enter Registration no:");
        long regno = sc.nextLong();
        kiitian k  = new kiitian();
        k.getinput(rollno, regno);
        System.out.println("Rollno:"+k.rollno);
        System.out.println("Registration no:"+k.regno);
        System.out.println("Course:"+k.Course());


    }
}
