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
        // Compara si estamos mandando el mismo objeto
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return Objects.equals(dni, person.dni);
    }

    /*
        El hashCode es el elemento que se utiliza cuando nosotros
        queremos agregar un elemento a un HashSet, cuando nosotros
        agregamos ese elemento ahi se ejecutara automaticamente
        este metodo. Este metodo crea una clave, si es un wrapper
        lo va a crear en función del dato pero si es una clase
        personalizada se va crear en funcion de los datos que
        nosotros le vamos a proporcionar.

        Colision de hash

        El segundo metodo que se ejecuta al agregar elementos es el
        equals, si pasa todas las verificaciones lo va a añadir, si no no
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
        Sirve para indicarle al TreeSet que vamos a ordenar
        por el dni
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
