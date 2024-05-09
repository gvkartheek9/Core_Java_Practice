package OOPS_Practice_May_09.ShapeHierarchy;

public class Circle extends Shape {
    private static final double PI=3.14159;
    private int radius;

    public Circle(int radius){
        this.radius=radius;
    }

    @Override
    public double caluculateArea(){
        System.out.println("this is circle");
        return PI*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*PI*radius;
    }
}
