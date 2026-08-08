package com.devtalles.project.files;

import com.devtalles.project.Person;
import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonWriter {
    static void main() {
        Person person = new Person("Juan", (byte)25, true);

        Gson gson = new Gson();

        // Sobreescribe el archivo
        try (FileWriter writer = new FileWriter("person.json")) {
            gson.toJson(person, writer);

            System.out.println("La persona fue guardada con éxito");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (FileReader reader = new FileReader("person.json")) {
            Person personJson = gson.fromJson(reader, Person.class);

            System.out.println(personJson);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("app finalizada");
    }
}
