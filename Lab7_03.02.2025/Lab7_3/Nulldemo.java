public class Nulldemo {
    public static void main(String[] args) {
        try {
            String str = null;
            System.err.println("Length of string :"+ str.length());
        } catch (NullPointerException e) {
            System.out.println("Exceprion caught : null pointer ");
        }finally{
            System.out.println("Excecution completed");
        }
    }
}
