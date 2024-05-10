package OOPs_Practice_May_10.ElectronicDevicesHierarchy;

public class Laptop extends ElectronicDevice {

    private String screenSize;
    private String software;
    private double price;

    Laptop(String brand,String modal, String screenSize,String software,double price){
         super(brand,modal);
         this.screenSize=screenSize;
         this.software=software;
         this.price=price;
    }

    public String getScreenSize() {
        return screenSize;
    }
    public String getSoftware(){
        return software;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void display(){
        System.out.println("The details of the Laptop are ");
        super.display();
        System.out.println(" "+getScreenSize()+" "+getSoftware()+" "+getPrice());
    }

}
