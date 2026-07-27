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
            System.out.println("El monto ingresado no es correcto.");

            return;
        }

        balance += amount;

        System.out.println("Depósito exitoso!!!");
    }

    public void withdraw(double amount) {
        if (amount <= 0 || amount > this.balance) {
            System.out.println("Fondos insuficientes o monto inválido");

            return;
        }

        this.balance -= amount;

        System.out.println("Extracción éxitosa!!!");
    }

    public void displayBalance() {
        System.out.println("Saldo: " + this.balance);
    }
}
