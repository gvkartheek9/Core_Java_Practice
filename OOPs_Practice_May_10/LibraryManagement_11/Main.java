package OOPs_Practice_May_10.LibraryManagement_11;

public class Main {
    public static void main(String[] args) {
        Book b1=new Book("1a","java","gosling",6);
        Book b2=new Book("1b","python","pycharm",8);
        System.out.println("let do operations on the book1 object");
        // the book b1 operations
        System.out.println("The quantity of b1 before borrowing the book is "+b1.getQuantity());
        if(b1.borrowBook()){
            System.out.println("the borrowing of book is successful");
            System.out.println("the quantity after the book is "+b1.getQuantity());
        }
        System.out.println("--------------------------------------------");
        System.out.println("The quantity of b1 before borrowing the book is "+b2.getQuantity());
        if(b2.borrowBook()){
            System.out.println("the borrowing of book is successful");
            System.out.println("the quantity after the book is "+b2.getQuantity());
        }


    }
}
