package com.devtalles.exception.personalized.checked;

/*
    Extendemos de Exception por que es de tipo CheckedException, es decir,
    esta excepcion pedira que la controlemos.

    Las excepciones personalizadas sirven para definir errores especificos
    para nuestro programar y hacer el codigo mas claro y facil de manejar
 */
public class AgeValidationException extends Exception {
    public AgeValidationException(String message) {
        super(message);
    }
}
