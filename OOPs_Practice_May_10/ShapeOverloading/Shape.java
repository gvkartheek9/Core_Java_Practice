package OOPs_Practice_May_10.ShapeOverloading;

public class Shape {
    public double area;

    public double caluculatingArea(int length,int breadth){
        System.out.println("The area of the Rectyangle is : ");
        return length*breadth;
    }
    public double caluculatingArea(int radius){
        System.out.println("This is Circle");
        return radius*radius*3.145;
    }
    public double caluculatingArea(int base,int height,String name){
        System.out.println("This is the "+name);
        return 0.5*base*height;
    }
}
