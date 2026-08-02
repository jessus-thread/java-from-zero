package com.devtalles.datastructure.equals;

import java.util.Objects;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        /*
            1. El primer if compara si apuntan al mismo espacio en memoria
            2. El segundo if comprueba si es null o si son de diferente
            tipo si una de las dos condiciones se cumplen retorna fale
         */
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Person person = (Person)obj;

        return Objects.equals(name, person.name);
    }

    static void main(String[] args) {
        Person person1 = new Person("Jessus");
        Person person2 = new Person("Jessus");

        System.out.println(person1.equals(person2));
    }
}
