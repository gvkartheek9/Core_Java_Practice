package OOPS_Practice_May_09.ShapeHierarchy;

public class RightAngledTriangle extends Triangle{
    int hypotenuse,base,height;


    public RightAngledTriangle(int base,int height,int hypotenuse){
        super(base,height);
        this.hypotenuse=hypotenuse;
    }

    @Override
    public double caluculateArea(){
//        System.out.println("This is right angle triangle"+getBreadth()+" "+getHeight()+" "+hypotenuse);
        return getBreadth()*getHeight()*hypotenuse;
    }
    public double perimeter(){
        return getBreadth()+getHeight()+hypotenuse;
    }

}
