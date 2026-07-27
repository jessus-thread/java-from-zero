package ProjectFinal;

import java.util.Scanner;

public class BankApp {
    private BankAccount account;
    private Scanner scanner;
    private final String[] options = {
        "\nSeleccionar opciones: ",
        "1 - Dépositar dinero",
        "2 - Retirar dinero",
        "3 - Mostrar saldo",
        "4 - salir"
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
        double depositAmount = this.createInputScanner("Ingrese el monto a depositar: ");

        this.account.deposit(depositAmount);
    }

    private void handleWithdrawal() {
        double withdrawAmount = this.createInputScanner("Ingrese el monto a retirar: ");

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
                System.out.println("Gracias por utilizar la app");

                break;
            }
            default: {
                System.out.println("Opción incorrecta");
            }
        }
    }
}
