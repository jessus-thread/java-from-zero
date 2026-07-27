package ProjectFinal;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("jessus.thread", 10000.00);
        BankApp bankApp = new BankApp(bankAccount);

        bankApp.start();
    }
}
