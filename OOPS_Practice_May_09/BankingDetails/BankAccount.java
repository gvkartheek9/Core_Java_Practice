package OOPS_Practice_May_09.BankingDetails;

public class BankAccount {
    private long accountNumber;
    private double accountBalance;

    public BankAccount(long accountNumber,double accountBalance){
        this.accountNumber=accountNumber;
        this.accountBalance=accountBalance;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountBalance(double Balance){
        this.accountBalance=Balance;
    }

    public void withDrawl(double amount){
        accountBalance=accountBalance-amount;
        System.out.println("the "+amount+" withdrawl is successful");
        System.out.println("Your available balance for "+getAccountNumber()+" is "+getAccountBalance());
    }
    public void deposit(double amount){
        accountBalance=accountBalance+amount;
        System.out.println("The "+amount+" deposit is successful");
        System.out.println("Your available balance for "+getAccountNumber()+" is "+getAccountBalance());
    }
}
