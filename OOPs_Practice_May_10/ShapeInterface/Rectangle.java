package OOPs_Practice_May_10.ShapeInterface;

public class Rectangle implements Shape{
    public final double PI=3.14;
    private int length,breadth;

    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    @Override
    public void caluculateArea() {
        System.out.println("The area of the Rectangle is "+(length*breadth));
    }

    @Override
    public void caluculatePerimeter() {
        System.out.println("The perimeter of the Rectangle is "+(2*(length+breadth)));
    }
}
