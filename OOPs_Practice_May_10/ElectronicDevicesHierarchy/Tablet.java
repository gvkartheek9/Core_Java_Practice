package OOPs_Practice_May_10.ElectronicDevicesHierarchy;

public class Tablet extends ElectronicDevice{

    private String screenSize;
    private double price;

    public Tablet(String brand, String modal,String screenSize,double price) {
        super(brand, modal);
        this.price=price;
        this.screenSize=screenSize;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void display(){
        System.out.println("The details of the tablet are: ");
        super.display();
        System.out.println(" "+getScreenSize()+" "+getPrice());
    }

}
