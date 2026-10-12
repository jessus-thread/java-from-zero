package org.devtalles.proyect;

/*

    What is an annotation?

    It is a tag that adds information or functionality
    to our code. If we get a bit more technical,
    we can say it is a meta-tag that adds
    information or behavior to the code without
    modifying the program's logic.

*/

import lombok.*;

// @Getter // Add the getter methods.
// @Setter // Add the setter methods.
// @ToString
// @EqualsAndHashCode
// @NoArgsConstructor // Create a no-argument constructor.
// @RequiredArgsConstructor // Create a constructor with required (final) arguments.
// @AllArgsConstructor // Create a constructor with all the properties.
/*
    El @Data create a constructor, getters and setters, equals and hashCode, toString
*/
// @Data
// @Value Make this class immutable, and automatically make the attributes private and final.
/*
    Builder is a design pattern that will allow me to...
*/
@Builder
@ToString
public class Person {
    private String name;
    private int age;
    private String lastName;
}
