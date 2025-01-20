// 3.Create an abstract class shape with a blank method called calcArea(). Derive two child class named as Circle and Triangle which will overrides the method and display the area accordingly.
abstract class Shape{
    abstract void calcArea();
}
class Circle extends Shape{
    double radius ;
    public Circle(double radius){
        this.radius = radius ;

    }
    public void calcArea(){
        double area = 3.14 * radius * radius; 
        System.out.println("The area of circle :"+area);
    }
}
class Triangle extends Shape{
    double base;
    double height ;
    public Triangle(double base, double height ){
        this.base = base ;
        this.height  = height ;

    }
    public void calcArea(){
        double area = 0.5* base * height; 
        System.out.println("The area of Triangle :"+area);
    }
}
public class Lab5_3 {
    public static void main(String[] args) {
        Shape circle  = new Circle(5);
        Shape Triangle = new Triangle(10, 5);
        circle.calcArea();
        Triangle.calcArea();
    }
}