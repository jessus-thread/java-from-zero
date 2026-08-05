package com.devtalles.datastructure.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExampleIterators {
    static void main() {
        List<String> names = new ArrayList<>();

        names.add("Gabriel");
        names.add("Jessica");
        names.add("Arami");
        names.add("Rafael");
        names.add("Jesús");
        names.add("Carlos");

        /*
            Un forEach internamente usa un iterador, esto lanza un error
            por que el iterador no esta pendiente de las modificaciones
            y en la segunda vuelta detecta la modificacion inesperada
            y lanza el error.

            Es importante saber que el forEach no soporta modificaciones
            mientras recorre la coleccion y es una mala practica intentar
            hacerlo
         */
//        for (String name : names) {
//            if (name.startsWith("A") || name.startsWith("C")) {
//                names.remove(name);
//            }
//        }

        // Solución al problema anterior es usar directamente un iterador
        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();

            if(name.startsWith("A") || name.startsWith("C")) {
                /*
                    Usamos el iterador en vez de la coleccion para
                    que el iterador se entere de la modificacion, es
                    importante no usar la colección para modificarla
                    directamente por que es una mala practica.

                    Solo podemos remover mas no añadir
                 */
                iterator.remove();
            }
        }

        System.out.println(names);
    }
}
