package com.devtalles.datastructure.list.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
            Actualización sobre métodos de LinkedList en JDK 21+ (JEP 431: Sequenced Collections)

            En versiones anteriores a Java 21, si tipábamos con la interfaz padre (List),
            perdíamos acceso a los métodos específicos de los extremos de LinkedList.
            A partir del JDK 21, List hereda de SequencedCollection, incorporando
            por defecto métodos como addFirst(), addLast(), removeFirst() y removeLast().

            - Ya no es necesario hacer casting a LinkedList para usarlos en Java 21+.
            - Refleja la evolución de la arquitectura del lenguaje orientada a interfaces.
         */
        List<String> cities = new LinkedList<>();

        /*
            Inserción estándar: O(1)
            El método add() viene de la interfaz Collection. En una LinkedList,
            esto simplemente enlaza un nuevo nodo al final de la cadena (Tail).
         */
        cities.add("Buenos Aires");
        cities.add("Coatzacoalcos");
        cities.add("New York");

        /*
            Inserción en los extremos: O(1) - ¡Aquí brilla LinkedList!
            Casteamos a LinkedList (necesario en JDK < 21) para acceder a sus métodos
            nativos. A nivel de memoria, esto no desplaza ningún elemento existente,
            solo actualiza los apuntadores del primer y último nodo.
         */
        ((LinkedList<String>) cities).addFirst("London");
        ((LinkedList<String>) cities).addLast("Berlin");

        /*
            Acceso por índice: O(n) - ¡El talón de Aquiles de LinkedList!
            Aunque aquí pedimos el índice 0 (lo cual es rápido), conceptualmente
            el método get(index) es ineficiente en listas enlazadas porque obliga
            a recorrer los nodos secuencialmente hasta encontrar la posición.
         */
        System.out.println(cities.get(0));
        System.out.println(cities);

        // Actualizar un elemento mediante índice (También requiere recorrer la lista: O(n))
        System.out.println(cities.set(2, "Madrid"));

        /*
            Eliminación por índice o valor:
            Paso 1: Buscar el elemento O(n) - Tiene que recorrer la lista.
            Paso 2: Eliminar el elemento O(1) - Solo rompe y reconecta 2 apuntadores.

            A diferencia de ArrayList, NO hay desplazamiento de los elementos a la derecha.
         */
        System.out.println(cities.remove(1));
        System.out.println(cities.remove("Berlin"));

        System.out.println(cities);

        /*
            Eliminación en los extremos: O(1)
            Liberación de memoria ultra rápida. Ideal para implementar estructuras
            como Colas (Queues - FIFO) o Pilas (Stacks - LIFO).
         */
        ((LinkedList<String>) cities).removeFirst();
        ((LinkedList<String>) cities).removeLast();

        String searchCity = "Buenos Aires";

        // contains() internamente ejecuta una búsqueda lineal O(n)
        if (cities.contains(searchCity)) {
            System.out.println("Está en la lista: " + searchCity);
        } else {
            System.out.println("No está en la lista: " + searchCity);
        }

        /*
            Iteración secuencial.
            Para LinkedList, usar foreach (que por debajo usa un Iterator) es la forma
            correcta y eficiente de recorrerla, en lugar de un for tradicional con get(i).
         */
        for (String city : cities) {
            System.out.println("- " + city);
        }
    }
}