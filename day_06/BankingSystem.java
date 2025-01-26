// Abstract class BankAccount
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getters and Setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Invalid withdraw amount or insufficient balance.");
        }
    }

    // Abstract method for interest calculation
    public abstract double calculateInterest();
}

// Interface Loanable
interface Loanable {
    void applyForLoan(double loanAmount);

    double calculateLoanEligibility();
}

// SavingsAccount class
class SavingsAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.04; // 4% annual interest
    private static final double LOAN_ELIGIBILITY_FACTOR = 5;

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double loanAmount) {
        System.out.println("Loan application received for: " + loanAmount);
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * LOAN_ELIGIBILITY_FACTOR;
    }
}

// CurrentAccount class
class CurrentAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.01; // 1% annual interest
    private static final double LOAN_ELIGIBILITY_FACTOR = 2;

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double loanAmount) {
        System.out.println("Loan application received for: " + loanAmount);
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * LOAN_ELIGIBILITY_FACTOR;
    }
}

// Main class to demonstrate the banking system
public class BankingSystem {
    public static void main(String[] args) {
        // Create accounts
        BankAccount savingsAccount = new SavingsAccount("SBI1234", "Alice", 5000);
        BankAccount currentAccount = new CurrentAccount("CA4567", "Bob", 10000);

        // Demonstrate polymorphism
        BankAccount[] accounts = { savingsAccount, currentAccount };
        for (BankAccount account : accounts) {
            System.out.println("Account Holder: " + account.getHolderName());
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Interest: " + account.calculateInterest());
            
        }

        // Loan-related operations
        if (savingsAccount instanceof Loanable) {
            Loanable loanable = (Loanable) savingsAccount;
            loanable.applyForLoan(20000);
            System.out.println("Loan Eligibility: " + loanable.calculateLoanEligibility());
        }

        if (currentAccount instanceof Loanable) {
            Loanable loanable = (Loanable) currentAccount;
            loanable.applyForLoan(15000);
            System.out.println("Loan Eligibility: " + loanable.calculateLoanEligibility());
        }
    }
}
