package OOPs_Practice_May_10.BankAccountDisplayOverloading;

public class CheckingAccount extends BankAccount{
    private double intrest = 0.2;

    public CheckingAccount(double accountBalance){
        super(accountBalance);
    }

    @Override
    public void display() {
        System.out.println("The CheckingAccount balance after the intrest added is ");
        System.out.println("The checking account balance is "+(getAccountBalance()+getAccountBalance()*intrest));
    }
}
