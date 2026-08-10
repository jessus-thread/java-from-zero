package org.devtalles.proyect;


public class Main {
    static void main() {
        /*
            El patron builder permite crear objetos de esta forma
         */
        Person person = Person.builder().name("Jessus").age(24).lastName("Thread").build();

        System.out.println(person);
    }
}
