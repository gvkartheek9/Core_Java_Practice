package OOPs_Practice_May_10.ElectronicDevicesHierarchy;

public class Main {
    public static void main(String[] args) {

//        Phone phone=new Phone("Samsung","1.5X","600px",10000.00);
//        Laptop laptop=new Laptop("Lenovo","1.6V","1250px","windows11",40000.00);
//        Tablet tab=new Tablet("Mi","1.0V","900px",15000.00);
//        SmartPhone smartPhone=new SmartPhone("Vivo","7pro","450px",12000.0,"120px");

//        phone.display();
//        System.out.println("-----------------------------------");
//        laptop.display();
//        System.out.println("-----------------------------------");      // here mutillevel and the heirarical inheritance is checked and
                                                                         // working here
//        tab.display();
//        System.out.println("-----------------------------------");
//        smartPhone.display();

        // The array of electronic device type which will be able to store objects of the different type and
        // able to access the method display() with different child class objects
        ElectronicDevice[] eleDevice=new ElectronicDevice[4];
        eleDevice[0]=new Phone("Samsung","1.5X","600px",10000.00);
        eleDevice[1]=new Laptop("Lenovo","1.6V","1250px","windows11",40000.00);
        eleDevice[2]= new Tablet("Mi","1.0V","900px",15000.00);
        eleDevice[3]= new SmartPhone("Vivo","7pro","450px",12000.0,"120px");
        for(ElectronicDevice ele:eleDevice){
            ele.display();
            System.out.println("------------------------------------------------");
        }
//        SmartPhone sm=new Phone("Samsung","1.5X","600px",10000.00);
    }
}
