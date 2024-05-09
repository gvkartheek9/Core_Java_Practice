package OOPS_Practice_May_09.ShapeHierarchy;

public class Main {
    public static void main(String[] args) {
        Circle c=new Circle(5);
        Rectangle r=new Rectangle(3,4);
        Triangle t=new Triangle(6,5);
        RightAngledTriangle right=new RightAngledTriangle(3,4,5);
//        System.out.println("The area of the circle is "+c.caluculateArea());
//        System.out.println("The area of the Rectangle is "+r.caluculateArea());
//        System.out.println("The area of the Triangle is "+t.caluculateArea());
//        System.out.println("The area of the Right Angled Triangle is "+right.caluculateArea());
//        System.out.println("The perimeter of the right angle triangle is "+right.perimeter());

        Shape[] shapes=new Shape[4];
        shapes[0]=new Circle(5);
        shapes[1]=new Rectangle(3,4);
        shapes[2]=new Triangle(6,5);
        shapes[3]=new RightAngledTriangle(3,4,5);

        for(Shape obj:shapes){
            if(obj instanceof Circle) {
                System.out.println("the area of circle is: "+obj.caluculateArea());
                System.out.println("----------------------------------------------");
            }
            if(obj instanceof Rectangle) {
                System.out.println("the area of Rectangle is: "+obj.caluculateArea());
                System.out.println("-------------------------------------------------");
            }
            if((obj instanceof Triangle)&&!(obj instanceof RightAngledTriangle)) {
                System.out.println("the area of Triangle is: "+obj.caluculateArea());
                System.out.println("-------------------------------------------------");
            }
            if(obj instanceof RightAngledTriangle){
                System.out.println("the area of right angle triangle is: "+obj.caluculateArea());
                System.out.println("------------------------------------------------------------");
            }
        }

    }
}
