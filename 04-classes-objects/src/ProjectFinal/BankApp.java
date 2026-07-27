package ProjectFinal;

import java.util.Scanner;

public class BankApp {
    private BankAccount bankAccount;
    private Scanner scanner;

    public BankApp(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        this.scanner = new Scanner(System.in);
    }
}
