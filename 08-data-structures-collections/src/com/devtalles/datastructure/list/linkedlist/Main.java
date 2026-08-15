package com.devtalles.datastructure.list.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    /*
        Update on LinkedList methods in JDK 21+ (JEP 431: Sequenced Collections)

        In versions prior to Java 21, if we typed with the parent interface (List),
        we lost access to the specific methods at the ends of LinkedList.
        Starting from JDK 21, List inherits from SequencedCollection, incorporating
        methods like addFirst(), addLast(), removeFirst(), and removeLast() by default.

        - It is no longer necessary to cast to LinkedList to use them in Java 21+.
        - This reflects the evolution of the language's interface-oriented architecture.
    */
        List<String> cities = new LinkedList<>();

        /*
            Standard insertion: O(1)
            The add() method comes from the Collection interface. In a LinkedList,
            this simply links a new node to the end of the chain (Tail).
        */
        cities.add("Buenos Aires");
        cities.add("Coatzacoalcos");
        cities.add("New York");

       /*
            Insertion at the ends: O(1) - This is where LinkedList shines!
            We cast to LinkedList (necessary in JDK < 21) to access its native methods.
            At the memory level, this does not shift any existing elements,
            it only updates the pointers of the first and last node.
        */
        ((LinkedList<String>) cities).addFirst("London");
        ((LinkedList<String>) cities).addLast("Berlin");

        /*
            Index access: O(n) - The Achilles' heel of LinkedList!
            Although here we request index 0 (which is fast), conceptually
            the get(index) method is inefficient in linked lists because it forces
            traversing the nodes sequentially until it finds the position.
        */
        System.out.println(cities.get(0));
        System.out.println(cities);

        // Update an element by index (Also requires traversing the list: O(n))
        System.out.println(cities.set(2, "Madrid"));

       /*
            Deletion by index or value:
            Step 1: Search for the element O(n) - It has to traverse the list.
            Step 2: Remove the element O(1) - It only breaks and reconnects 2 pointers.

            Unlike ArrayList, there is NO shifting of elements to the right.
        */
        System.out.println(cities.remove(1));
        System.out.println(cities.remove("Berlin"));

        System.out.println(cities);

     /*
        Removal at the ends: O(1)
        Ultra-fast memory deallocation. Ideal for implementing data structures
        like Queues (FIFO) or Stacks (LIFO).
    */
        ((LinkedList<String>) cities).removeFirst();
        ((LinkedList<String>) cities).removeLast();

        String searchCity = "Buenos Aires";

        // contains() internally performs an O(n) linear search.
        if (cities.contains(searchCity)) {
            System.out.println("It's on the list.: " + searchCity);
        } else {
            System.out.println("It is not on the list.: " + searchCity);
        }

    /*
        Sequential iteration.
        For a LinkedList, using a foreach loop (which uses an Iterator under the hood) is the
        correct and efficient way to traverse it, instead of a traditional for loop with get(i).
    */
        for (String city : cities) {
            System.out.println("- " + city);
        }
    }
}