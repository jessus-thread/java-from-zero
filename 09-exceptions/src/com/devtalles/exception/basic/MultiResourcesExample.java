package com.devtalles.exception.basic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MultiResourcesExample {
    static void main() {
        /*
            Abrir mas de un recurso al mismo tiempo
         */
        try (
                BufferedReader reader = new BufferedReader(new FileReader("src/example.txt"));
                BufferedReader reader2 = new BufferedReader(new FileReader("src/example2.txt"))
        ) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            System.out.println("Reader 2: " + reader2.readLine());
        } catch (FileNotFoundException error) {
            System.out.println("El archivo no fue encontrado");
        } catch (IOException error) {
            System.out.println("Error en la lectura del archivo");
        }

    }
}
