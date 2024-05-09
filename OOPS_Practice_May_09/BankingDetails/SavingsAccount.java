package OOPS_Practice_May_09.BankingDetails;

public class SavingsAccount extends BankAccount {
    private double intrest=0.05;

    public SavingsAccount(long accountNumber, double accountBalance) {
        super(accountNumber, accountBalance);
    }

    public double intrestCaluculation(){
        double balance=getAccountBalance();
        balance+=balance*intrest;
        System.out.println("the intrest for the account  balance you are given is "+balance*intrest);
//        setAccountBalance(balance);
        return balance;
    }

    public void savingBalance(){
        double interestBalance;
       interestBalance= intrestCaluculation();
        setAccountBalance(interestBalance);
        System.out.println("The saving account balance after the intrest is "+getAccountBalance());
    }

}
