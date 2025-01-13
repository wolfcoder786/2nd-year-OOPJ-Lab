public class Lab4_1 {
    public static void main(String[] args) {
         // Implicit Type Conversion 
         int intVal = 42;
         double doubleVal = intVal; // int to double (automatic)
         System.out.println("Implicit Conversion (Widening):");
         System.out.println("Integer value: " + intVal);
         System.out.println("Converted to double: " + doubleVal);
 
         // Explicit Type Casting 
         double originalDouble = 42.65;
         int castedInt = (int) originalDouble; // double to int (manual)
         System.out.println("\nExplicit Conversion (Narrowing):");
         System.out.println("Original double value: " + originalDouble);
         System.out.println("Converted to integer: " + castedInt);
    }
}
