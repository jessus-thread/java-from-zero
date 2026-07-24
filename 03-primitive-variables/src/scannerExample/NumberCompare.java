package scannerExample;

import java.util.Scanner;

public class NumberCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");

        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second number: ");

        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;

        System.out.println("The sum of a + b: " + sum);
        System.out.println("The subtraction of a - b: " + difference);

        if (firstNumber > secondNumber) {
            System.out.println("The first number is greater");
        } else {
            System.out.println("The second number is greater than or equal to.");
        }

        System.out.println("End of the app");

        scanner.close();
    }
}
