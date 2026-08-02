package com.devtalles.datastructure.list.hashset;

import java.util.HashSet;
import java.util.Set;

public class MainHashSet {
    static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();

        for (int i = 1; i <= 6; i++) {
            numbers.add(Integer.valueOf(i + "0"));
        }

        // No acepta elementos repetidos
        numbers.add(10);

        // No respeta el orden
        System.out.println(numbers);

        //Eliminar un elemento
        numbers.remove(10);

        System.out.println(numbers);

        /*
            Tenemos que recordar que en el Set no contamos con el métod
            set para actualizar ya que el set no trabaja mediante indices.

            Lo primero que debemos hacer es eliminar el elemento que deseamos
            actualizar y luego agregar el nuevo elemento
         */

        numbers.remove(60);
        numbers.add(65);

        System.out.println(numbers);
    }
}
