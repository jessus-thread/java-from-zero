package com.devtalles.datastructure.equals;

public class ExampleEquals {
    static void main(String[] args) {
        Integer numberA = 100;
        Integer numberB = 100;

        /*
            Pregunta si estas direcciones de memorias son exactamente iguales

            Pero algo importante a recordar es que guarda cache en numeros
            de -128 a 127, por eso es que al comparar 100 == 100 da true
            pero al comparar numeros mayores a 127 por mas que ambas variables
            almacenen lo mismo va a dar false.

            ¿Por qué se cachean los números entre -128 y 127?

            Porque son los valores más usados en la mayoría de los programas
            según Java. Java evita crear nuevos objetos para estos valores y
            reutiliza las instancias que ya están en la memoría
         */
        System.out.println(numberA == numberB);

        // Compara el valor en si
        System.out.println(numberA.equals(numberB));
    }
}
