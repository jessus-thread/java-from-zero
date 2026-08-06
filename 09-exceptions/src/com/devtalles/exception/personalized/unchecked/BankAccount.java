package com.devtalles.exception.personalized.unchecked;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            throw new NegativeBalanceException("Fondos insuficientes...");
        }

        this.balance -= amount;

        System.out.println("Extracción exitosa.");
    }

    public double getBalance() {
        return balance;
    }

    static void main() {
        BankAccount account = null;

        try {
             account = new BankAccount(500);

            account.withdraw(600);

            System.out.println("Saldo: " + account.getBalance());
        } catch (NegativeBalanceException error) {
            System.out.println(error.getMessage());
        }
    }
}
