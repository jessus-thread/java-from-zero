package scannerExample;

import java.util.Scanner;

public class NumberCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");

        int a = sc.nextInt();

        System.out.println("Enter the second number: ");

        int b = sc.nextInt();

        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        System.out.println("The sum of a + b: " + (a + b));

        sc.close();
    }
}
