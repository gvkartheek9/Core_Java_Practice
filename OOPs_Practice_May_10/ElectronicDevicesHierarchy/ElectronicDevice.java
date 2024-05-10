package OOPs_Practice_May_10.ElectronicDevicesHierarchy;

public class ElectronicDevice {

    private String brand;
    private String modal;

    public ElectronicDevice(String brand,String modal){
        this.brand=brand;
        this.modal=modal;
    }

    public String getBrand() {
        return brand;
    }

    public String getModal() {
        return modal;
    }

    public void display(){
        System.out.println("the details of brand and modal are "+getBrand()+" "+getModal());
    }

}
