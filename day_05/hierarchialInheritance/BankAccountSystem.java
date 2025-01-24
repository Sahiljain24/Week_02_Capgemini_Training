package day_05.hierarchialInheritance;
/*Sample Problem 1: Bank Account Types
Description: Model a banking system with different account types using hierarchical inheritance. BankAccount is the superclass, with SavingsAccount, CheckingAccount, and FixedDepositAccount as subclasses.
Tasks:
Define a base class BankAccount with attributes like accountNumber and balance.
Define subclasses SavingsAccount, CheckingAccount, and FixedDepositAccount, each with unique attributes like interestRate for SavingsAccount and withdrawalLimit for CheckingAccount.
Implement a method displayAccountType() in each subclass to specify the account type.
Goal: Explore hierarchical inheritance, demonstrating how each subclass can have unique attributes while inheriting from a shared superclass.

 */
// Base class: BankAccount
class BankAccount {
    // Common attributes for all account types
    String accountNumber;
    double balance;

    // Constructor to initialize a BankAccount object
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display common account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    // Method to display account type (to be overridden in subclasses)
    public void displayAccountType() {
        System.out.println("Account Type: General Bank Account");
    }
}

// Subclass: SavingsAccount (inherits from BankAccount)
class SavingsAccount extends BankAccount {
    // Additional attribute for savings account
    double interestRate;

    // Constructor to initialize the SavingsAccount object
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        // Call the superclass constructor to initialize common attributes
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Method to display details specific to a SavingsAccount
    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails(); // Call superclass method to display common account details
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    // Override displayAccountType to specify the type as Savings Account
    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}

// Subclass: CheckingAccount (inherits from BankAccount)
class CheckingAccount extends BankAccount {
    // Additional attribute for checking account
    double withdrawalLimit;

    // Constructor to initialize the CheckingAccount object
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        // Call the superclass constructor to initialize common attributes
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    // Method to display details specific to a CheckingAccount
    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails(); // Call superclass method to display common account details
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }

    // Override displayAccountType to specify the type as Checking Account
    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }
}

// Subclass: FixedDepositAccount (inherits from BankAccount)
class FixedDepositAccount extends BankAccount {
    // Additional attribute for fixed deposit account
    int maturityPeriod; // in months

    // Constructor to initialize the FixedDepositAccount object
    public FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        // Call the superclass constructor to initialize common attributes
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    // Method to display details specific to a FixedDepositAccount
    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails(); // Call superclass method to display common account details
        System.out.println("Maturity Period: " + maturityPeriod + " months");
    }

    // Override displayAccountType to specify the type as Fixed Deposit Account
    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {
        // Creating objects for different account types
        SavingsAccount savings = new SavingsAccount("45j6", 5000.00, 3.5);
        CheckingAccount checking = new CheckingAccount("8j87", 1000.00, 2000.00);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD787j89", 10000.00, 12);

        // Displaying details for each account type
        System.out.println("\nSavings Account Details:");
        savings.displayAccountType();
        savings.displayAccountDetails();

        System.out.println("\nChecking Account Details:");
        checking.displayAccountType();
        checking.displayAccountDetails();

        System.out.println("\nFixed Deposit Account Details:");
        fixedDeposit.displayAccountType();
        fixedDeposit.displayAccountDetails();
    }
}
