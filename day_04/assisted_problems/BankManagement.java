package assisted_problems;

// Bank class with name
class Bank {
    public void openAccount(Customer customer) {
        System.out.println("Account opened for " + customer.getName());
    }
}

// Customer class with name and account balance
class Customer {
    private String name;
    private String accountNumber;
    private double balance;

    Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void viewBalance() {
        System.out.println("Balance: " + balance);
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    // displayAll method
    public void displayAll() {
        System.out.println("Name: " + name + " Account Number: " + accountNumber + " Balance: " + balance);
    }
}

public class BankManagement {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Customer customer1 = new Customer("Nishant");
        customer1.setBalance(7000000);
        customer1.displayAll();
        bank.openAccount(customer1);
        customer1.viewBalance();

    }

}