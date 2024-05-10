package OOPs_Practice_May_10.BankAccountInterface;

public class CheckingAccount implements BankAccount{

    private double accountBalance;

    CheckingAccount(double accountBalance){
        this.accountBalance=accountBalance;
    }

    @Override
    public double getBalance() {
        return accountBalance;
    }
    @Override
    public void deposit(double amount){
        if(amount>0){
            accountBalance+=amount;
        }
    }
    @Override
    public void withdrawl(double amount) {
        if(amount>0 && amount<accountBalance){
            accountBalance-=amount;
        }
    }


}
