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
            int result = 10 / 0;

            System.out.println(result);
        } catch (ArithmeticException e) {
            // Se puede multiples catch
//            System.out.println("Division by zero");
//            e.printStackTrace();
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Siempre se ejecuta");
        }

        try {
            int[] numbers = new int[3];

            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException error) {
            StackTraceElement[] stack = error.getStackTrace();

            for (StackTraceElement element : stack) {
                System.out.println("Clase donde se produce el error: " + element.getClassName());
                System.out.println("Método: " + element.getMethodName());
                System.out.println("Archivo: " + element.getFileName());
                System.out.println("Linea: " + element.getLineNumber());
            }
        }



//        recursive();
        System.out.println("El programa finaliza");
    }
}
