package com.devtalles.datastructure.iterators;

import java.util.*;

public class ListIteratorExample {
    /*
        The ListIterator interface is used to traverse a list in both directions,
        forwards and backwards, and to modify the list during iteration
        without throwing exceptions.
    */

    static void main() {
        /*
            Arrays.asList generates a fixed-size list; that is,
            we can update the data within it, but we cannot
            add or remove elements, which is why we pass it
            as an argument to ArrayList.
        */
        List<String> names = new ArrayList<>(Arrays.asList("Gabriel", "Angel", "Lucia", "Jessus", "Rogelio"));

        System.out.println(names);

        addName(names, "Carla");
        updateName(names, "Elizabeth", "Lucia");
        removeName(names, "Jessus");
        readNames(names);
    }

    public static void addName(List<String> names, String newName) {
        ListIterator<String> iterator = names.listIterator();

        while (iterator.hasNext()) {
            String name = iterator.next();

            if(name.equals("Gabriel")) {
                // Add it after Gabriel.
                iterator.add(newName);

                // We break the loop after adding.
                break;
            }
        }
    }

    public static void updateName(List<String> names, String newName, String oldName) {
        ListIterator<String> iterator = names.listIterator();

        while (iterator.hasNext()) {
            if(iterator.next().equals(oldName)) {
                // Add it after Gabriel.
                iterator.set(newName);

                // We break the loop after adding.
                break;
            }
        }
    }

    public static void removeName(List<String> names, String nameToDelete) {
        ListIterator<String> iterator = names.listIterator();

        while (iterator.hasNext()) {
            if(iterator.next().equals(nameToDelete)) {
                // Add it after Gabriel.
                iterator.remove();

                // We break the loop after adding.
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
