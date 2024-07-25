public class BankAccount {
    //Creating the attributes for the bank account balance and account holder's name
    private double balance;
    private String customerName;

    //Creating the constructor to initialize the bank account with a name and balance
    public BankAccount(String customerName, double balance) {
        this.customerName = customerName;
        this.balance = balance;
    }

    //Creating a method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("$" + amount + " deposited. New balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    //Creating a method to withdraw money from the account
    public void withdrawal(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn. New balance: $" + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    //Creating a method to print the account details
    public void printAccountDetails() {
        System.out.println("Account Holder: " + customerName);
        System.out.println("Account Balance: $" + balance);
    }
}
