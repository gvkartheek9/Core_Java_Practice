package OOPS_Practice_May_09.ShapeHierarchy;

public class Rectangle extends Shape{

    private int l,b;

    public Rectangle(int l, int b){
        this.l=l;
        this.b=b;
    }

    @Override
    public double caluculateArea() {
        System.out.println("this is rectangle");
        return (l*b);
    }

    @Override
    public double perimeter() {
        return 2*(l+b);
    }

}
