package com.devtalles.project.files;

import com.devtalles.project.Person;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class JsonWriterReaderListExample {
    static void main() {
        Person person = new Person("Juan", (byte)25, true);

        Gson gson = new Gson();

        List<Person> people = new ArrayList<>();

        try (FileReader reader = new FileReader("person.json")) {
            /*
                Type le indica a gson que esto es una lista de Person
                y que lo convierta correctamente
             */
            Type listType = new TypeToken<List<Person>>() {}.getType();
            people = gson.fromJson(reader, listType);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        for (Person person1 : people) {
            System.out.println("Nombre: " + person1.getName());
            System.out.println("Age: " + person1.getAge());
            System.out.println("Is Student: " + person1.isStudent());
            System.out.println("-----------------------------------------------");
        }

        people.add(new Person("Rogelio", (byte)35, false));

        try (FileWriter writer = new FileWriter("person.json")) {
            // Escribimos una lista completa
            gson.toJson(people, writer);

            System.out.println("La persona fue guardada con éxito");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (FileReader reader = new FileReader("person.json")) {
            /*
                Type le indica a gson que esto es una lista de Person
                y que lo convierta correctamente
             */
            Type listType = new TypeToken<List<Person>>() {}.getType();
            people = gson.fromJson(reader, listType);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        for (Person person1 : people) {
            System.out.println("Nombre: " + person1.getName());
            System.out.println("Age: " + person1.getAge());
            System.out.println("Is Student: " + person1.isStudent());
            System.out.println("-----------------------------------------------");
        }
    }
}
