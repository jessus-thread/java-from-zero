package com.devtalles.datastructure.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
            Siempre es mejor tipar la variable con la interfaz padre (Polimorfismo).

            Algo que debemos tener en cuenta es que el ArrayList utiliza un arreglo
            fijo por debajo. Cada vez que este arreglo llega a su límite de capacidad,
            Java crea un nuevo arreglo con un 50% más de posiciones y copia todos
            los elementos originales a este nuevo espacio de memoria.
         */
        List<String> students = new ArrayList<>();

        // Agrega un elemento siempre al final
        students.add("Patricia");
        students.add("Jesús");
        students.add("Fernando");

        /*
            Método sobre cargado de add, agrega un elemento en una pocision
            en especifico
         */

        students.add(1, "Alejandro");

        System.out.println(students);

        // Obtener mediante indice
        System.out.println(students.get(2));

        /*
            Elimina el elemento mediante su índice y retorna el dato que fue eliminado.

            Nota (para ArrayList): Con el método remove pareciera que eliminamos
            de manera directa y mágica, pero en realidad, a nivel de memoria,
            Java tiene que recorrer y desplazar hacia la izquierda todos los
            elementos posteriores para tapar el hueco y reacomodar la lista.
         */
        System.out.println(students.remove(2));

        System.out.println(students);

        /*
            Actualizar un elemento mediante indice y retornar el anterior valor
         */
        System.out.println(students.set(0, "Patricia - Actualizada"));

        System.out.println(students);

        // Comprueba si un elemento existe en la lista
        System.out.println(students.contains("Alejandro"));
    }
}
