package com.devtalles.exception.personalized;

public class AgeValidator {
    static void main() {
        try {
            Person person = Person.createPerson("Lucas", 18);

            System.out.println(person);
        } catch (AgeValidationException error) {
            System.out.println("La edad debe ser mayor a 18 años.");
        }
    }
}
