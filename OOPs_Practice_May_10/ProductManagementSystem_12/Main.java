package OOPs_Practice_May_10.ProductManagementSystem_12;

public class Main {
    public static void main(String[] args) {
        Product p1=new Product("101","product1",120.0,150);
        Product p2=new Product("102","product2",150.0,250);
        System.out.println("product1 Details");
        System.out.println("The quantity before adding is "+p1.getStocklevel());
        p1.addToInventory(50);
        System.out.println("the quantity after adding inventory is "+p1.getStocklevel());
        p1.updatStockLevel(500);
        System.out.println("the quantity after the updation is "+p1.getStocklevel());

        System.out.println("---------------------------------------------------------");

        System.out.println("product2 Details");
        System.out.println("The quantity before adding is "+p2.getStocklevel());
        p2.addToInventory(50);
        System.out.println("the quantity after adding inventory is "+p2.getStocklevel());
        p2.updatStockLevel(1500);
        System.out.println("the quantity after the updation is "+p2.getStocklevel());


    }
}
