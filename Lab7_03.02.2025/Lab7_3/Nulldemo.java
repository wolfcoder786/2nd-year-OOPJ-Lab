public class Nulldemo {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println("Length of string :"+ str.length()); 
        } catch (NullPointerException e) {
            System.out.println("Exceprion caught : null pointer ");
        }finally{
            System.out.println("Excecution completed");
        }
    }
}
