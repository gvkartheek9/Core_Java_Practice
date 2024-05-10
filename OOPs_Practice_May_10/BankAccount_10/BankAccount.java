package OOPs_Practice_May_10.BankAccount_10;

public class BankAccount {
    private String accountNumber,customerName;
    private double initialBalance;

    public BankAccount(String accountNumber,String customerName,double initialBalance){
        this.accountNumber=accountNumber;
        this.customerName=customerName;
        this.initialBalance=initialBalance;
    }

    public void deposit(double amount){
        if(amount>0){
            initialBalance+=amount;
        }
        System.out.println("The amount "+amount+" is successfully deposited");
    }
    public void withdrawl(double amount){
        if(amount>0 && amount<=initialBalance){
            initialBalance-=amount;
        }
        System.out.println("The amount "+amount+" withdrawl is successful");
    }

    public double checkBalance(){
        return initialBalance;
    }

}
