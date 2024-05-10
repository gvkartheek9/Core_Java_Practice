package OOPs_Practice_May_10.LibraryManagement_11;

public class Book {
    private String isbn,title,author;
    private int quantity;

    public Book(String isbn,String  title,String author,int quantity){
        this.isbn=isbn;
        this.title=title;
        this.author=author;
        this.quantity=quantity;
    }
    public  boolean borrowBook(){
        if(quantity>0){
//            System.out.println("the book borrowing is successful");
            quantity-=1;
            return true;
        }
        return false;
    }
    public int getQuantity(){
        return quantity;
    }
    public void returnBook(){
        quantity+=1;
    }
}
