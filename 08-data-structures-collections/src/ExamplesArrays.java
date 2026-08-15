import java.util.ArrayList;

public class ExamplesArrays {
    public static void main(String[] args) {
        /*
            Array of integers (Wrapper). This array is static,
            meaning that once instantiated in memory, its length is immutable.

            Performance: Static arrays do not have the overhead of
            the methods of a class like ArrayList. They are the most
            direct access to RAM memory that Java allows.
        */
        Integer[] numbers = { 1, 2, 3, 4, 5 };

       /*
            Modify a value at a specific position: O(1)

            That O(1) is part of what in computer science we call Big O Notation, which is used to measure the efficiency and performance of an algorithm.

            Specifically, O(1) means "Constant Time".

            It means that this operation will take the exact same amount of time and resources, no matter how large the data structure is. Your numbers array could have 10 elements or 100 million elements; modifying position [0] will take the exact same effort: a single step.

            To contrast (Linear Time)

            If instead of modifying a specific position, you had to search for the number 1000 inside the array without knowing its position, you would have to use a for loop to check index 0, then 1, then 2... until you find it.

            If the array has 1 million elements, in the worst-case scenario you would have to perform 1 million steps. This is known as O(n) or "Linear Time", because the execution time grows linearly along with the amount of data.

        */
        numbers[0] = 1000;

        for (Integer num : numbers) {
            System.out.println(num);
        }

        System.out.println("--------------------------");

        /*
            We allocate a contiguous block of memory for 100 elements.

            Technical note: Being an array of primitives (int), the default value
            of each position is automatically initialized to 0 at the byte level.
            There are no null values here.

            The 'new' keyword indicates that the array itself is an object
            for the Java Virtual Machine (JVM), even though its content consists
            of pure primitive data.

        */
        int[] fixedArray = new int[100];

        for (int number : fixedArray) {
            System.out.println(number);
        }

        /*
            `length` is not a method (it does not take parentheses); it is a final attribute (constant) of the array.
        */
        System.out.println("Dimensión: " + fixedArray.length);

      /*
            Dynamic data structures (Java Collections Framework)

            To use generics (<>) and dynamic collections, Java forces us
            to use Wrapper classes (like Integer) because the JFC works exclusively
            with Object references, not with primitives.
        */
        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(30);

        for (Integer num : numbers2) {
            System.out.println("ArrayList: " + num);
        }

        System.out.println("--------------------------");

        // Primitives: Raw memory, default value = 0
        int[] numbersPrimitive = new int[5];

        // Wrappers: Object references, default value = null
        Integer[] numbersWrapper = new Integer[5];

      /*
            Architecture Rule:
            - We use primitives (int[]) when we need maximum performance,
            pure mathematical calculations, and don't care about an "absent" state.
            - We use Wrappers (Integer[]) or Collections when we need
            to represent the absence of a value (null), interact with APIs,
            or use utility methods (.toString(), .parseInt()).
        */
        numbersPrimitive[0] = 5;
        numbersWrapper[4] = 50;

        // For-Each Loop (Enhanced syntax for iterators)
        for (Integer num : numbersWrapper) {
            // Protection against NullPointerException (NPE)
            if (num != null) {
                System.out.println(num.toString());
                continue;
            }
            System.out.println("Es null");
        }

        System.out.println("-------------------------------------------------");

       /*
            MANUAL RESIZING: The magic behind ArrayList
            Since arrays are immutable in size, the only way to
            "grow" is to create a new array and copy the data.
        */
        int[] numberOriginal = new int[5];
        numberOriginal[0] = 20;
        numberOriginal[4] = 29;

       // 1. We create a new memory space with the expanded capacity.
        int[] newNumbers = new int[numberOriginal.length + 1];

        /*
            2. System.arraycopy(): O(n)
            This method is extremely fast because it does not iterate element by element
            in Java. It is a "native" method (written in C/C++) that tells the Operating
            System to copy a block of RAM memory directly to another address.

            Parameters: (source, sourcePosition, destination, destinationPosition, length)
        */
        System.arraycopy(numberOriginal, 0, newNumbers, 0, numberOriginal.length);

        newNumbers[5] = 500;

        for (int num : newNumbers) {
            System.out.println(num);
        }

        System.out.println("--------------------------------");

        /*
            MANUAL REMOVAL: Shifting
            This is the exact recreation of why ArrayList.remove() is O(n).
        */
        int[] numbersRandoms = {1, 2, 3, 4, 5, 9, 0};
        final int deletePosition = 2; // We want to erase the '3'.

        /*
            We iterate from the position to be deleted, and move all elements
            to the right one space to the left. We fill the gap.
        */
        for (int i = deletePosition; i < numbersRandoms.length - 1; i++) {
            numbersRandoms[i] = numbersRandoms[i + 1];
        }

        // We clear the last remaining position (optional, but good practice).
        numbersRandoms[numbersRandoms.length - 1] = 0;

        // Additional modification
        numbersRandoms[0] = 200;

        for (int number : numbersRandoms) {
            System.out.println(number);
        }
    }
}