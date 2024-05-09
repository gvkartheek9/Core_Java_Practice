package OOPS_Practice_May_09.ShapeHierarchy;

public class Triangle extends Shape
{
    int breadth,height,s1,s2,s3;

    public Triangle(int base, int height) {
        this.breadth=base;
        this.height=height;
    }
    public int getBreadth(){
        return breadth;
    }
    public int getHeight(){
        return height;
    }

    public Triangle(int breadth,int height ,int s1,int s2,int s3){
        this.breadth=breadth;
        this.height=height;
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
    }


    @Override
    public double caluculateArea(){
        System.out.println("This is Triangle");
        return (0.5*breadth*height);
    }

    @Override
    public double perimeter() {
        return (s1*s2*s3);
    }
}
