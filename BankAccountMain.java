public class BankAccountMain {
    public static void main(String[] args) {
        //Creating a BankAccount object with an initial balance of 500 dollars
        BankAccount christinaAccount = new BankAccount("Christina Holland", 500.00);

        //Calling the deposit method to add 100 dollars into Christina's account
        christinaAccount.deposit(100.00);

        //Printing the details of Christina's account to the console
        christinaAccount.printAccountDetails();

        //Creating another BankAccount object with an initial balance of 5000 dollars
        BankAccount chloeAccount = new BankAccount("Chloe Evans", 5000.00);

        //Calling the withdrawl method to subtract 100 dollars from Chloe's account
        chloeAccount.withdrawal(100.00);

        //Printing the details of Chloe's account to the console
        chloeAccount.printAccountDetails();

        //Creating one more BankAccount object with an initial balance of 300 dollars
        BankAccount brittanyAccount = new BankAccount("Brittany Bowen", 300.00);

        //Calling the deposit method to add 100 dollars into Brittany's account
        brittanyAccount.deposit(100.00);

        //Printing the details of Brittany's account to the console
        brittanyAccount.printAccountDetails();
    }
}

