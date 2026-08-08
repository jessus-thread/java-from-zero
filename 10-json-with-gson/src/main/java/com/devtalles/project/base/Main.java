package com.devtalles.project.base;

import com.devtalles.project.Person;
import com.google.gson.Gson;

public class Main {
    static void main() {
        Person person = new Person("Jessus", (byte)24, true);

        // Serializar y deserializar JSON con GSON
        Gson gson = new Gson();
        String json = gson.toJson(person);

        System.out.println(json);

        json = """
            {
                "name":"Jessus",
                "age":24,
                "student":true
            }
        """;

        /*
            Convierte el JSON a un objeto de java, el primer parametro es el json
            y el segundo la clase a la que se transformara
         */
        Person person2 = gson.fromJson(json, Person.class);

        System.out.println("Age: " + person2.getAge());
        System.out.println("Name: " + person2.getName());
    }
}
