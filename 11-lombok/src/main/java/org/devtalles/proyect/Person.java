package org.devtalles.proyect;

/*
    Que es una anotación?

   Es una etiqueta que añade información o funcionalidad
   a nuestro código, si nos ponemos un poquito mas técnicos
   podemos decir que es una metaetiqueta que en el código
   agrega información o comportamiento pero sin modificar
   la logica del programa
 */

import lombok.*;

// @Getter // agrega los metodos getters
// @Setter // agrega los metodos setters
// @ToString
// @EqualsAndHashCode
// @NoArgsConstructor // crea un constructor sin argumentos
// @RequiredArgsConstructor // crea un constructor con argumentos requeridos (final)
// @AllArgsConstructor // crea un constructor con todas las propiedades
/*
    El @Data crea un constructor, getters and setters, equals y hasCode, toString
*/
// @Data
// @Value convierte esta clase en inmutable, convierte los atributos automaticamente en privados y final
/*
    Builder es un patron de diseño que me va a permitir
*/
@Builder
@ToString
public class Person {
    private String name;
    private int age;
    private String lastName;
}
