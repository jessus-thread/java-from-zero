package ProjectFinal;

import java.util.Scanner;

public class BankApp {
    private BankAccount account;
    private Scanner scanner;
    private final String[] options = {
        "\nSelect options: ",
        "1 - Deposit money",
        "2 - Withdraw money",
        "3 - Show balance",
        "4 - go out"
    };

    public BankApp(BankAccount bankAccount) {
        this.account = bankAccount;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        int option;

        do {
            displayMenu();

            option = this.getUserOption();

            this.processOption(option);
        } while(option != 4);
    }

    private void displayMenu() {
        for (String option : this.options) {
            System.out.println(option);
        }
    }

    private int getUserOption() {
        return this.scanner.nextInt();
    }

    private double createInputScanner(String label) {
        System.out.println(label);

        return this.scanner.nextDouble();
    }

    private void handleDeposit() {
        double depositAmount = this.createInputScanner("Enter the amount to deposit: ");

        this.account.deposit(depositAmount);
    }

    private void handleWithdrawal() {
        double withdrawAmount = this.createInputScanner("Enter the amount to withdraw: ");

        this.account.withdraw(withdrawAmount);
    }

    private void processOption(int option) {
        switch(option) {
            case 1: {
                this.handleDeposit();

                break;
            }
            case 2: {
                this.handleWithdrawal();

                break;
            }
            case 3: {
                account.displayBalance();

                break;
            }
            case 4: {
                System.out.println("Thank you for using the app.");

                break;
            }
            default: {
                System.out.println("Incorrect option");
            }
        }
    }
}
