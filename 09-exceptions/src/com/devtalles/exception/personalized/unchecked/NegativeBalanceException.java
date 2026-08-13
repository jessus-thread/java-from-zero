package com.devtalles.exception.personalized.unchecked;

/*
    It is an unchecked exception; in other words, Java will not
    force us to handle it.

    Unchecked exceptions (which inherit from RuntimeException): these
    are used for fatal programming or configuration errors from
    which recovery is impossible
 */
public class NegativeBalanceException extends RuntimeException {
    public NegativeBalanceException(String message) {
        super(message);
    }
}
