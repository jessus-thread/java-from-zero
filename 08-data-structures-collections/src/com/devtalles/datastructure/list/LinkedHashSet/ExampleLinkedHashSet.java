package com.devtalles.datastructure.list.LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class ExampleLinkedHashSet {
    static void main(String[] args) {
        Set<Integer> numbers = new LinkedHashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        System.out.println(numbers);

        numbers.remove(30);

        System.out.println("numbers = " + numbers);

        numbers.remove(60);
        numbers.add(90);

        System.out.println(numbers);

        // Comprueba si existe el elemento
        System.out.println(numbers.contains(10));
    }
}
