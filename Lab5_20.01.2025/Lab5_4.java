// Do the Program No 3 in a different way where Shape class reference object will point circle class method (i.e. Dynamic Polymorphism). But this object will be able call only Shape class function and not the child class own 
abstract class Shape{
    abstract void calcArea();
    public void display(){
        calcArea();
    }
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
public class Lab5_4 {
    public static void main(String[] args) {
        Shape shape1  = new Circle(5);
        Shape shape2 = new Triangle(10, 5);
        shape1.display();
        shape2.display();
}
}