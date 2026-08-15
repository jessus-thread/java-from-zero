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
            1. The first if checks if they point to the same memory location.
            2. The second if checks if it is null or if they are of different types;
                if either condition is met, it returns false.
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
