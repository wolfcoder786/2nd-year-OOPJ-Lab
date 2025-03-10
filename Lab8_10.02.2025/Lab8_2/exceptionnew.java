// Write a Java class which has a method called ProcessInput(). 	This method checks the number entered by the user. If the entered number is 	negative then throw an user defined exception called NegativeNumberException, 	otherwise it displays the double value of the entered number

import java.util.Scanner;

class NegativeNumberException extends Exception{
    public NegativeNumberException(String m ){
        super(m);
    }
}

public class exceptionnew {
    public static void ProcessInput(int n ) throws NegativeNumberException{
        if (n < 0) {
            throw new NegativeNumberException("Negative Number found "+n);
            
        }else{
            System.out.println("Double value of the entered number is: "+(n*2));
        }
    }
    public static void main(String[] args) {
        try{
            Scanner sc  = new Scanner(System.in);
            System.out.println("Enter a number:");
            int n = sc.nextInt();
            ProcessInput(n);
        }catch(NegativeNumberException e){
            System.out.println("Exception :"+e.getMessage());
        }catch (Exception e) {
            System.out.println("Invalid input! Please enter only integers.");
    }finally{
        System.out.println("Execution completed.");
    }
    }
}
