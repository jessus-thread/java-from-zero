package com.devtalles.datastructure.set.treeset;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExampleTreeSet {
    static void main(String[] args) {
        /*
            Los arboles son mas eficientes en la busqueda, a medida
            que vamos ingresando datos los va ordenando.

            El criterio que utiliza para ordenar numeros es del
            menor a mayor, no permite duplicados
         */
        Set<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(60);
        numbers.add(30);
        numbers.add(40);
        numbers.add(20);
        numbers.add(50);

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
