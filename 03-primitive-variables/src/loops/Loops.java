package loops;

public class Loops {
    public static void main(String[] args) {
        Loops.exampleLoopFor();
        Loops.exampleLoopWhile();
        Loops.exampleLoopDoWhile();
    }

    /*
        It is executed at least once and then evaluates the request
    */
    private static void exampleLoopDoWhile() {
        int counter = 0;

        do {
            System.out.println("Coounter Do While: " + counter);

            counter++;
        } while (counter < 5);
    }

    private static void exampleLoopWhile() {
        int counter = 0;
        int accumulator = 0;

        while (counter < 5) {
            System.out.println("Counter While: " + counter);

            accumulator = accumulator + counter;
            counter++;
        }

        System.out.println("Accumulator: " + accumulator);
    }

    private static void exampleLoopFor() {
        // Literal constant
        final int MAX_COUNT = 5;

        for (int currentNumber = 0; currentNumber <= MAX_COUNT; currentNumber++) {
            System.out.println("Counte: " + currentNumber);
        }
    }
}