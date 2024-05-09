package OOPS_Practice_May_09.BankingDetails;

public class CheckingAccount extends BankAccount{

    private double overdraftLimit;

    public CheckingAccount(long accountNumber,double amount,double overdraftLimit){
        super(accountNumber,amount);
        this.overdraftLimit=overdraftLimit;
    }

    @Override
    public void withDrawl(double amount) {
        if(amount<= getAccountBalance()+overdraftLimit){
            setAccountBalance(getAccountBalance()-amount);
            System.out.println("The withdrawl  is successful for the amount "+amount);
            System.out.println("the balance after the withdrawl for account number "+getAccountNumber()+" is "+getAccountBalance());
        }
        else{
            System.out.println("The amount is exceeding the overdraft limit please provide less amount");

        }
    }
}
