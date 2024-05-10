package OOPs_Practice_May_10.ElectronicDevicesHierarchy;

public class Phone extends ElectronicDevice{

    private String screenSize;
    private double price;

    Phone(String brand , String modal, String screenSize,double price){
        super(brand,modal);
        this.screenSize=screenSize;
        this.price=price;
    }

    public double getPrice() {
        return price;
    }

    public String getScreenSize() {
        return screenSize;
    }

    @Override
    public void display(){
        System.out.println("The mobile details are : ");
        super.display();
        System.out.println(" the price:  "+getPrice()+" the screen size "+getScreenSize());
    }
}
