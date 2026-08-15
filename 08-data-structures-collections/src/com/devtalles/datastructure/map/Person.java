package com.devtalles.datastructure.map;

import java.util.*;

public class Person implements Comparable<Person> {
    private String name;
    private String dni;

    public Person(String name, String dni) {
        this.name = name;
        this.dni = dni;
    }

    @Override
    public boolean equals(Object o) {
        // Check if we are sending the same object.
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return Objects.equals(dni, person.dni);
    }

    /*
        The hashCode is the element used when we
        want to add an element to a HashSet. When we
        add that element, this method is executed
        automatically. This method creates a key; if it is a wrapper,
        it will create it based on the data, but if it is a
        custom class, it will be created based on the data we
        provide.

        Hash collision

        The second method executed when adding elements is
        equals. If it passes all verifications, it will be added; otherwise, it won't.
    */
    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
    
    /*
        Used to tell the TreeSet that we are going to sort by DNI.
    */
    @Override
    public int compareTo(Person o) {
        return this.dni.compareTo(o.dni);
    }

    static void main(String[] args) {

        Map<String,Person> persons = new HashMap();
        Person person1 = new Person("Jessus", "1");
        Person person2 = new Person("Minee", "2");
        Person person4 = new Person("Jessus - Diferente", "3");

        persons.put(person1.dni, person1);
        persons.put(person2.dni, person2);
        persons.put(person4.dni, person4);

        System.out.println(persons);

        // delete
        persons.remove(person1.dni);

        System.out.println(persons);

        persons.put(person1.dni, new Person("Gabriel", "9999"));

        System.out.println(persons);
    }
}
