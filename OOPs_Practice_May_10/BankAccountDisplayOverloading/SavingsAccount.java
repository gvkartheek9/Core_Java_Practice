package OOPs_Practice_May_10.BankAccountDisplayOverloading;

public class SavingsAccount extends BankAccount{
     private double intrest=0.08;

     public  SavingsAccount(double accountBalance){
         super(accountBalance);
     }

     @Override
     public void display(){
         System.out.println("the account balance after adding savings intrest");
         double balance=(getAccountBalance()+getAccountBalance()*intrest);
         System.out.println("the account balance "+balance);
     }
}
