package OOPs_Practice_May_10.BankAccountDisplayOverloading;

public class Main {
    public static void main(String[] args) {

        SavingsAccount sa=new SavingsAccount(15000.0);
        CheckingAccount ca=new CheckingAccount(16000.0);
        sa.display();
        System.out.println("---------------------------------------------");
        ca.display();

    }


}
