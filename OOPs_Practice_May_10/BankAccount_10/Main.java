package OOPs_Practice_May_10.BankAccount_10;

public class Main {
    public static void main(String[] args) {
        BankAccount cus1=new BankAccount("123456","customer1",10000.0);
        BankAccount cus2=new BankAccount("56789","customer2",12000.0);
        BankAccount cus3=new BankAccount("98765","customer3",13000.0);

        System.out.println("the customer 1 operations ");
        System.out.println("the initial balance is "+cus1.checkBalance());
        cus1.deposit(5000.0);
        cus1.withdrawl(6000.0);
        System.out.println("the balance after the operations is "+cus1.checkBalance());
        System.out.println("-------------------------------------");

        System.out.println("the customer 2 operations ");
        System.out.println("the initial balance is "+cus2.checkBalance());
        cus1.deposit(5000.0);
        cus1.withdrawl(6000.0);
        System.out.println("the balance after the operations is "+cus2.checkBalance());

    }

}
