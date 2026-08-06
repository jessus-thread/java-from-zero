package com.devtalles.exception.personalized.unchecked;

/*
    Es de tipo unchecked, es decir, java no nos obligara a controlar
    esta exception
 */
public class NegativeBalanceException extends RuntimeException {
    public NegativeBalanceException(String message) {
        super(message);
    }
}
