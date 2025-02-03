public class Arrayindexoutdemo {
    public static void main(String[] args) {
        try {
            int a[] = {1,2,3,4,5};
            System.out.println("Accessing element at index 8 :"+a[8]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught : Array accessed out of index");
        }finally{
            System.out.println("Excecution completed");
        }
    }
}
