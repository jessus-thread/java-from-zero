package com.devtalles.exception.basic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {
    static void main() {
        try {
            readFile("src/example1.txt");
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("El programa finaliza");
    }

    /*
        Solucion de catch mas simple, es comun ver que las excepciones
        son lanzadas a una jerarquia superior, es decir, que el padre
        que lo consume maneje ese error.
     */
    public static void readFile(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));

        System.out.println("El archivo fue abierto con exito");

        reader.close();
    }
}
