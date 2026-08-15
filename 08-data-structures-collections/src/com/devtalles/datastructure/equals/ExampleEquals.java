package com.devtalles.datastructure.equals;

public class ExampleEquals {
    static void main(String[] args) {
        Integer numberA = 100;
        Integer numberB = 100;

        /*
            It checks whether these memory addresses are exactly the same.

            However, something important to remember is that it caches numbers
            from -128 to 127. This is why comparing 100 == 100 returns true,
            but comparing numbers greater than 127 will return false, even if
            both variables store the exact same value.

            Why are numbers between -128 and 127 cached?

            Because they are the most frequently used values in most programs,
            according to Java. Java avoids creating new objects for these values
            and reuses the instances already present in memory.
        */
        System.out.println(numberA == numberB);

        // Compare the value itself.
        System.out.println(numberA.equals(numberB));
    }
}
