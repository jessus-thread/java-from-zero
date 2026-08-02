package com.devtalles.datastructure.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
            Siempre es mejor tipar la variable con la interfaz padre (Polimorfismo).

            Algo que debemos tener en cuenta es que el ArrayList utiliza un arreglo
            fijo por debajo. Cada vez que este arreglo llega a su límite de capacidad,
            Java crea un nuevo arreglo con un 50% más de posiciones y hace una
            copia masiva de todos los elementos originales a este nuevo espacio de memoria.
         */
        List<String> students = new ArrayList<>();

        /*
            Inserción secuencial: Amortizada O(1)
            Agrega un elemento siempre al final. Generalmente es instantáneo,
            a menos que se alcance la capacidad máxima y se dispare el
            redimensionamiento (ahí costaría O(n)).
         */
        students.add("Patricia");
        students.add("Jesús");
        students.add("Fernando");

        /*
            Inserción por índice: O(n) - ¡La debilidad de ArrayList!
            Método sobrecargado de add. Agrega un elemento en una posición en específico.
            A nivel de memoria, esto obliga a desplazar hacia la derecha a todos
            los elementos posteriores para hacerle espacio a "Alejandro".
         */
        students.add(1, "Alejandro");

        System.out.println(students);

        /*
            Acceso por índice: O(1) - ¡Aquí es donde ArrayList destruye a LinkedList!
            El acceso es directo e instantáneo mediante cálculo matemático en RAM.
         */
        System.out.println(students.get(2));

        /*
            Elimina el elemento mediante su índice y retorna el dato que fue eliminado.

            Nota (para ArrayList): O(n)
            Con el método remove pareciera que eliminamos de manera directa y mágica,
            pero en realidad, a nivel de memoria, Java tiene que recorrer y desplazar
            hacia la izquierda todos los elementos posteriores para tapar el hueco
            y reacomodar la lista.
         */
        System.out.println(students.remove(2));

        System.out.println(students);

        /*
            Actualización por índice: O(1)
            Como el acceso es directo, sobrescribir el valor en esa celda
            de memoria es instantáneo. Retorna el valor anterior.
         */
        System.out.println(students.set(0, "Patricia - Actualizada"));

        System.out.println(students);

        /*
            Búsqueda por valor: O(n)
            Comprueba si un elemento existe en la lista. Como Java no sabe en
            qué índice está, tiene que iterar desde el principio comparando uno por uno.
         */
        System.out.println(students.contains("Alejandro"));
    }
}