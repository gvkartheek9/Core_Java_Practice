class Account1 {
    // Private fields to encapsulate account details
    private String accountNumber;
    private double balance;

    // Public constructor to initialize account details (data is encapsulated)
    public Account1(String accountNumber, double balance) {
        // Potential validation or checks can be done here before setting values
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Public getter methods for controlled access
    public String getAccountNumber() {
        return accountNumber;
    }

    // Public setter methods for controlled modification (encapsulation)
    public void setBalance(double amount) {
        if (amount >= 0) { // Enforce a minimum balance rule
            balance = amount;
        } else {
            System.out.println("Invalid deposit amount. Must be non-negative.");
        }
    }

    // Public methods for other operations (controlled access)
    public void deposit(double amount) {
        setBalance(balance + amount);  // Leverage the setter for controlled modification
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            setBalance(balance - amount);
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

    // (Optional) Public method to display account details (controlled presentation)
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        // Create an Account object
        Account1 myAccount = new Account1("123456", 1000.00);

        // Access account number using the public getter
        String accountNum = myAccount.getAccountNumber();
        System.out.println("Account number: " + accountNum);

        // Deposit funds using the public method
        myAccount.deposit(500.00);

        // Attempt to deposit a negative amount (controlled by the setter)
        myAccount.deposit(-100.00);

        // Withdraw funds using the public method
        myAccount.withdraw(200.00);

        // Display account details using the public method
        myAccount.displayAccountInfo();
    }
}
