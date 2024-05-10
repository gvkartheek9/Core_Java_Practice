package OOPs_Practice_May_10.ProductManagementSystem_12;

public class Product {
    private String productId,name;
    private double price;
    private int quantityInStock;

    public Product(String productId,String name,double price,int quantityInStock){
        this.productId=productId;
        this.name=name;
        this.price=price;
        this.quantityInStock=quantityInStock;
    }

    public void addToInventory(int quantity){
          if(quantity>0){
              quantityInStock+=quantity;
          }
    }

    public void updatStockLevel(int newQuantity){
        if(newQuantity>0){
            quantityInStock=newQuantity;
        }
    }

    public int getStocklevel(){
        return quantityInStock;
    }


}
