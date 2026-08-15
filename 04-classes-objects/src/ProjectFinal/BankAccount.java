package ProjectFinal;

public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("The amount entered is incorrect.");

            return;
        }

        balance += amount;

        System.out.println("Successful deposit!!!");
    }

    public void withdraw(double amount) {
        if (amount <= 0 || amount > this.balance) {
            System.out.println("Insufficient funds or invalid amount");

            return;
        }

        this.balance -= amount;

        System.out.println("Successful extraction!!!");
    }

    public void displayBalance() {
        System.out.println("Balance: " + this.balance);
    }
}
