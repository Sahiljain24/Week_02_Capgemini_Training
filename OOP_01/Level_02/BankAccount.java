/*Question 2:Program to Simulate an ATM

Problem Statement: Create a BankAccount class with attributes accountHolder, accountNumber, and balance. Add methods for:
Depositing money.
Withdrawing money (only if sufficient balance exists).
Displaying the current balance.
 */

public class BankAccount {
   private  String accountHolder;
    private long  accountNumber;
    private double balance;

    BankAccount(String accountHolder,  long  accountNumber,  double balance){
         this.accountHolder=accountHolder;
         this.accountNumber=accountNumber;
         this.balance=balance;
      }

      public void deposit(long amount){
         balance+=amount;
         System.out.println("Money succesfully deposited");
      }
      public void Withdraw(long amount){
        if(balance>=amount){
            balance-=amount;
            System.out.println("Money succesfully Withdrawal");
        }else{
            System.out.println("insufficient Balance");
        }

        
     }
     public void displayCurrentBalance (){
        System.out.println("The current balance is " + balance);
     }

}
 class BankAccountMain{
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Sahil Jain",759461, 1524652);
        bankAccount.displayCurrentBalance();
        bankAccount.deposit(5000);
        bankAccount.displayCurrentBalance();
        bankAccount.Withdraw(4000);
        bankAccount.displayCurrentBalance();
    }
 }
