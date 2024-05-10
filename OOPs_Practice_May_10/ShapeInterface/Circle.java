package OOPs_Practice_May_10.ShapeInterface;

public class Circle implements Shape{
        public final double PI=3.14;
        private int radius;

         public Circle(int radius){
            this.radius=radius;
        }

    @Override
    public void caluculateArea() {
        System.out.println("The area of the circle is "+(PI*radius*radius));
    }

    @Override
    public void caluculatePerimeter() {
        System.out.println("The perimeter of the cicle is "+(2*PI*radius));
    }
}
