package com.devtalles.datastructure.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       /*
            It is always better to declare the variable using the parent interface (Polymorphism).

            Something to keep in mind is that ArrayList uses a fixed array underneath.
            Whenever this array reaches its capacity limit, Java creates a new array
            with 50% more positions and performs a bulk copy of all original elements
            to this new memory space.
        */
        List<String> students = new ArrayList<>();

        /*
            Sequential insertion: Amortized O(1)
            Always adds an element at the end. It is generally instantaneous,
            unless the maximum capacity is reached and resizing is triggered
            (at that point it costs O(n)).
        */
        students.add("Patricia");
        students.add("Jesús");
        students.add("Fernando");

    /*
        Insertion by index: O(n) - The weakness of ArrayList!
        Overloaded add method. Adds an element at a specific position.
        At the memory level, this forces all subsequent elements to be shifted
        to the right to make room for "Alejandro".
    */
        students.add(1, "Alejandro");

        System.out.println(students);

        /*
            Index access: O(1) - This is where ArrayList destroys LinkedList!
            Access is direct and instantaneous via mathematical calculation in RAM.
        */
        System.out.println(students.get(2));

        /*
            Removes the element at the specified index and returns the removed data.

            Note (for ArrayList): O(n)
            With the remove method, it might seem like we are deleting directly and magically,
            but in reality, at the memory level, Java has to iterate and shift all subsequent
            elements to the left to fill the gap and rearrange the list.
        */
        System.out.println(students.remove(2));

        System.out.println(students);

       /*
            Update by index: O(1)
            Since access is direct, overwriting the value in that memory
            cell is instantaneous. Returns the previous value.
        */
        System.out.println(students.set(0, "Patricia - Actualizada"));

        System.out.println(students);

        /*
            Search by value: O(n)
            Checks if an element exists in the list. Since Java doesn't know
            at which index it is, it has to iterate from the beginning,
            comparing one by one.
        */
        System.out.println(students.contains("Alejandro"));
    }
}