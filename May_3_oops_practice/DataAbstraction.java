class Account {
    // Private fields to store account details (data is hidden)
    private String accountNumber;
    private double balance;

    // Public constructor to initialize account details
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Public getter method to access the account number (controlled access)
    public String getAccountNumber() {
        //Validation will be done
        return accountNumber;
    }

    // Public method to deposit funds (allows controlled modification)
    public void deposit(double amount) {
        //validation
        balance += amount;
    }

    // Public method to withdraw funds (controlled modification)
    public void withdraw(double amount) {
        //validation
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

    //  Public method to display account details (controlled presentation)
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

public class DataAbstraction {
    public static void main(String[] args) {
        // Create an Account object (data is initialized in the constructor)
        Account myAccount = new Account("123456", 1000.00);

        // Access account number using the public getter (controlled access)
        String accountNum = myAccount.getAccountNumber();
        System.out.println("Account number: " + accountNum);

        // Deposit funds using the public method (controlled modification)
        myAccount.deposit(500.00);

        // Withdraw funds using the public method (controlled modification)
        myAccount.withdraw(200.00);

        //  Display account details using the public method
        myAccount.displayAccountInfo();
    }
}
