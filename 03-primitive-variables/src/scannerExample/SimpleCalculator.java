package scannerExample;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = getNumber(scanner, "Enter the first number: ");
        int secondNumber = getNumber(scanner, "Enter the second number: ");

        printArithmeticOperations(firstNumber, secondNumber);
        compareNumber(firstNumber, secondNumber);

        System.out.println("End of the app");

        scanner.close();
    }

    public static int getNumber(Scanner scanner, String message) {
        System.out.println(message);

        return scanner.nextInt();
    }

    public static void printArithmeticOperations(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;

        System.out.println("The sum of a + b: " + sum);
        System.out.println("The subtraction of a - b: " + difference);
    }

    public static void compareNumber(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            System.out.println("The first number is greater");
        } else {
            System.out.println("The second number is greater than or equal to.");
        }
    }
}
