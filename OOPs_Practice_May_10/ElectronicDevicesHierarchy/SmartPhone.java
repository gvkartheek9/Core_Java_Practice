package OOPs_Practice_May_10.ElectronicDevicesHierarchy;

public class SmartPhone extends Phone{

    private String camera;

    public SmartPhone(String brand,String modal,String screenSize,double price,String camera){
        super(brand,modal,screenSize,price);
        this.camera=camera;
    }

    public String getCamera() {
        return camera;
    }

    @Override
    public void display() {
        System.out.println("The details of the SmartPhone are : ");
        super.display();
        System.out.println(""+getCamera());
    }
}
