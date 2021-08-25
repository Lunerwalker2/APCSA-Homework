/**
 * Represents a bank account
 */

public class BankAccount {


    private double balance;

    /**
     * Constructs a bank account with a given initial amount.
     *
     * @param amount The initial value of the account
     */
    public BankAccount(double amount){
        balance = amount;
    }

    /**
     * Constructs a bank account with an amount of 0.
     */
    public BankAccount(){
        this(0);
    }

    /**
     * Gives the current balance of the account
     * @return the current balance
     */
    public double getBalance() {
        return balance;
    }

    /**.
     * Deposits the given amount into the account
     * @param amount Amount to deposit
     */
    public void deposit(double amount){
        balance += amount;
    }

    /**
     * Withdraws the given amount from the account.
     * @param amount The amount o withdraw
     */
    public void withdraw(double amount){
        balance -= amount;
    }

    /**
     * Applies an interest rate to the current balance of the account
     * @param rate The interest to apply in %
     */
    public void addInterest(double rate){
        balance *= 1 + (rate/100);
    }

}
