package com.devtalles.exception.basic;

public class Main {
    // La recursividad es una especie de bucle
    public static void recursive() {
        recursive();
    }

    static void main() {
        /*
            La excepciones permiten manejar errores de forma controlada.

            ¿Que son las excepciones?

            Las excepciones son eventos que ocurren durante la ejecuciónn de un
            programa y que interrumpen el flujo normal del codigo.

            Muchas veces cuando nosotros hablamos de excepciones se confunden
            con los que son errores y normalmente los errores en Java son
            diferentes, son si se quiere problemas más graves que ocurren
            a nivel de sistema o de la Java Virtual Machine.

            Algunas diferencias entre excepciones y errores es que los
            errores son problemas más graves como ya dijimos que están a
            nivel de sistema o a nivel de la Java Virtual Machine
            no suelen manejarse dentro del código por que indican
            fallas criticas
         */

        try {
            int result = 10 / 2;

            System.out.println(result);
        } catch (ArithmeticException e) {
            // Se puede multiples catch
            System.out.println("Division by zero");
        } finally {
            System.out.println("Siempre se ejecuta");
        }

//        recursive();
        System.out.println("El programa finaliza");
    }
}
