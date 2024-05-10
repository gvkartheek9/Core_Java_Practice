package OOPs_Practice_May_10.ShapeInterface;

import org.w3c.dom.css.Rect;

public class Main {
    public static void main(String[] args) {
        Circle c=new Circle(6);
        Rectangle r=new Rectangle(4,6);
        System.out.println("The circle details is: ");
        c.caluculateArea();
        c.caluculatePerimeter();
        System.out.println("The Rectangle details is : ");
        r.caluculateArea();
        r.caluculatePerimeter();
    }
}
