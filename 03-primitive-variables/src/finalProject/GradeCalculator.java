package finalProject;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final double PASSING_GRADE = 6.0;
        
        boolean repeat;

        do {
            byte age = GradeCalculator.scanByte(scanner, "Enter age: ");

            System.out.println("Enter 3 ratings");

            int grade1 = GradeCalculator.scanInteger(scanner, "First score: ");
            int grade2 = GradeCalculator.scanInteger(scanner, "Second score: ");
            int grade3 = GradeCalculator.scanInteger(scanner, "Third score: ");

            int sum = grade1 + grade2 + grade3;
            double average = sum / 3.0;

            boolean isApproved = average >= PASSING_GRADE;

            System.out.println((isApproved ? "APPROVED" : "FAILED") + " Age: " + age);

            byte option = GradeCalculator.scanByte(scanner, "Do you want to continue? (1: Yes, 0: No)");

            repeat = option == 1;

        } while (repeat);


        System.out.println("Program Completed");

        scanner.close();
    }

    private static byte scanByte(Scanner scanner, String label) {
        System.out.println(label);

        return scanner.nextByte();
    }

    private static int scanInteger(Scanner scanner, String label) {
        System.out.println(label);

        return scanner.nextInt();
    }
}
