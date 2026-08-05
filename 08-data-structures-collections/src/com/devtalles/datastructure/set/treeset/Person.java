package com.devtalles.datastructure.set.treeset;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

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
        /*
            El TreeSet requiere que los objetos implementen
            si o si la interfaz comparable o que se le pase
            al Treeset un comparator

            No podemos utilizar nulos

            Son buenos para la busqueda
         */
        Set<Person> persons = new TreeSet<>();
        Person person1 = new Person("Jessus", "1");
        Person person2 = new Person("Minee", "2");

        /*
            No lo va a agregar al Set por mas que el nombre sea diferente ya que
            evalua por dni y ya hay un dni existente
         */
        Person person4 = new Person("Jessus - Diferente", "3");

        // Create
        persons.add(person1);
        persons.add(person2);
        persons.add(person4);

        /*
            Añadiendo el metodo toString podemos ver el arreglo en si con sus
            valores sin iterar el arreglo
         */
        System.out.println(persons); // read or list

        for (Person person : persons) {
            if (person != null) System.out.println(person.name);
        }

        // delete
        persons.remove(person1);

        System.out.println(persons);

        /*
            Update

            No existe un metodo update en si, para actualizar
            necesitamos eliminar y luego agregar
         */
        persons.add(person1);

        System.out.println(persons);

        System.out.println(persons.contains(new Person("Jessus", "12345")));
    }
}
