package com.devtalles.project.task;

import com.devtalles.project.Person;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonSaver {
    static void main() {
        Person person1 = new Person(
                "Jessus",
                (byte)30,
                true,
                Arrays.asList("Estudiar", "Programar", "Leer", "Hablar")
        );

        Person person2 = new Person(
                "Fernando",
                (byte)28,
                false,
                Arrays.asList("Correr", "Futbol", "Leer", "Hablar")
        );

        List<Person> people = Arrays.asList(person1, person2);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter("person.json")) {
            gson.toJson(people, writer);

            System.out.println("Lista de personas guardadas correctamente");
        } catch (IOException error) {
            System.out.println(error.getMessage());
        }
    }
}
