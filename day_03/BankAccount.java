/*Sample Program 1: Bank Account System
Create a BankAccount class with the following features:
Static:
A static variable bankName shared across all accounts.
A static method getTotalAccounts() to display the total number of accounts.
This:
Use this to resolve ambiguity in the constructor when initializing accountHolderName and accountNumber.
Final:
Use a final variable accountNumber to ensure it cannot be changed once assigned.
Instanceof:
Check if an account object is an instance of the BankAccount class before displaying its details.

 
*/
public class BankAccount {

    // Static final variable to represent the name of the bank, common to all accounts
    static final String bankName = "Bank of Bhopal";

    // Static variable to keep track of the total number of accounts created
    static int totalNumberOfAccount;
    
    // Final variable to store the account holder's name, cannot be changed after initialization
    final String accountHolderName;

    // Final variable to store the unique account number, cannot be changed after initialization
    final int accountNumber;

    // Static method to get the total number of accounts in the bank
    static int getTotalAccounts() {
        return totalNumberOfAccount;
    }

    // Constructor to initialize the account holder's name and assign a unique account number
    BankAccount(String name) {
        this.accountHolderName = name; // Set the account holder's name
        totalNumberOfAccount++; // Increment the total number of accounts
        accountNumber = totalNumberOfAccount; // Assign a unique account number
    }

    // Static block to initialize the static variable before any object is created
    static {
        totalNumberOfAccount = 0; // Initialize total number of accounts to zero
    }

    // Method to display account details
    public void displayDetails() {
        System.out.println("Account holder name = " + accountHolderName +
                           ", account number = " + accountNumber +
                           ", Bank Name = " + bankName +
                           ", total no. of account in the bank = " + getTotalAccounts());
    }

    public static void main(String[] args) {
        // Create the first bank account
        BankAccount first = new BankAccount("Sahil Jain");

        // Check if the object is an instance of BankAccount and display its details
        if (first instanceof BankAccount) {
            first.displayDetails();
        }
    }
}
