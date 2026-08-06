package com.devtalles.exception.basic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
    static void main() {
        /*
            Esto significa que si el archivo no se pudo abrir nunca no entraremos
            al tryCath. Esto se conoce como try-with-resources.

            Cuando colocamos un recurso entre los parentesis del try se cierra
            el recurso automaticamente, es importante cerrar los recursos
            para evitar fugas de memoria.

            Como se cierra automaticamente ya no se necesita cerrarlo de manera
            implicita
         */
        try (BufferedReader reader = new BufferedReader(new FileReader("src/example.txt"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException error) {
            System.out.println("El archivo no fue encontrado");
        } catch (IOException error) {
            System.out.println("Error en la lectura del archivo");
        }

    }
}
