package com.devtalles.datastructure.iterators;

import java.util.*;

public class ListIteratorExample {
    /*
            La interfaz ListIterator sirve para recorrer una lista en ambos sentidos,
            hacia delante y hacia atras, modificar la lista durante la iteracion
            sin generar excepciones
         */

    static void main() {
        /*
            Arrays.asList genera una lista inmutable, es decir,
            podemos actualizar los datos que estan en ella pero no podemos
            agregar ni eliminar, por eso lo colocamos como argumento dentro
            de ArrayList
         */
        List<String> names = new ArrayList<>(Arrays.asList("Gabriel", "Angel", "Lucia", "Jessus", "Rogelio"));

        System.out.println(names);

        addName(names, "Minerva");
        updateName(names, "Arami", "Lucia");
        removeName(names, "Jessus");
        readNames(names);
    }

    public static void addName(List<String> names, String newName) {
        ListIterator<String> iterator = names.listIterator();

        while (iterator.hasNext()) {
            String name = iterator.next();

            if(name.equals("Gabriel")) {
                // Agrega despues de gabriel
                iterator.add(newName);

                // Rompemos el bucle despues de agregar
                break;
            }
        }
    }

    public static void updateName(List<String> names, String newName, String oldName) {
        ListIterator<String> iterator = names.listIterator();

        while (iterator.hasNext()) {
            if(iterator.next().equals(oldName)) {
                // Agrega despues de gabriel
                iterator.set(newName);

                // Rompemos el bucle despues de agregar
                break;
            }
        }
    }

    public static void removeName(List<String> names, String nameToDelete) {
        ListIterator<String> iterator = names.listIterator();

        while (iterator.hasNext()) {
            if(iterator.next().equals(nameToDelete)) {
                // Agrega despues de gabriel
                iterator.remove();

                // Rompemos el bucle despues de agregar
                break;
            }
        }
    }

    public static void readNames(List<String> names) {
        ListIterator<String> iterator = names.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }

        System.out.println();
    }
}
