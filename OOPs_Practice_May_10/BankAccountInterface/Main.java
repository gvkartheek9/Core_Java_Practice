package OOPs_Practice_May_10.BankAccountInterface;

public class Main {
    public static void main(String[] args) {
        SavingsAccount sa=new SavingsAccount(5000.0);
        CheckingAccount ca=new CheckingAccount(6000.0);
        System.out.println("The Savings account details are : ");
        System.out.println("The savings account balance is : "+sa.getBalance());
        sa.deposit(5000.0);
        sa.withdrawl(5000.0);
        System.out.println("The savings account balance after the operations on savings account "+sa.getBalance());
        System.out.println("-------------------------------------------------------");
        System.out.println("The Checking account details are");
        System.out.println("The savings account balance is: "+ca.getBalance());
        ca.deposit(2000.0);
        ca.withdrawl(2000.0);
        System.out.println("the checking account balance after the operations are "+ca.getBalance());
    }

}
