package OOPs_Practice_May_10.ShapeOverloading;

public class Main {
    public static void main(String[] args) {
        Shape shape=new Shape();
        System.out.println("The area of the Rectangle is : "+shape.caluculatingArea(2,4));
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("The area of the Circle is : "+shape.caluculatingArea(5));
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("The area of the Triangle is : "+shape.caluculatingArea(3,4,"Triangle"));
    }
}
