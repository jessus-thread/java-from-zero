package com.devtalles.exception.basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    static void main() {
        BufferedReader reader = null;

        try {
            /*
                Bufferedreader Mejora la eficiencia de la lectura al permitir
                leer las lineas completas y FileReader abre el archivo
             */
            reader = new BufferedReader(new FileReader("src/example.txt"));

            //Recorremos todo el archivo linea por linea
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            /*
                //        } catch (FileNotFoundException error) {
//            System.out.println("El archivo no existe");

                 Removimos el catch con el tipo de excepcion FileNotFoundException
                 por que FileNotFoundException hereda de la clase padre IOException
                 e igualmente es atrapada por el catch, podríamos usar FileNotFoundException
                 cuando queramos realizar algo en especifico por ejemplo
                 sabemos que la excepcion FileNotFoundException se dispara cuando
                 la ruta no existe entonces podriamos crear el archivo ahi
             */
        } catch (IOException error) {
            System.out.println("Error en la lectura del archivo");
        } finally {
            try {
                /*
                    Comprobamos si reader es diferente de null
                    por que puede que la ruta no existe e intentaria
                    cerrar un archivo que nunca se abrio
                 */
                if (reader != null) {
                    reader.close();

                    System.out.println("El archivo fue cerrado correctamente");
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo");
            }
        }

    }
}
