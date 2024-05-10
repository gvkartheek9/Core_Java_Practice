package OOPs_Practice_May_10.BankAccountDisplayOverloading;

public class BankAccount {
    private double accountBalance;

    public BankAccount(double accountBalance){
        this.accountBalance=accountBalance;
    }


    public void display(){
        System.out.println("The account balance in the bankAccount is "+this.accountBalance);
    }

    public double getAccountBalance() {
        return accountBalance;
    }
}
