package com.devtalles.exception.personalized.checked;

/*
    We extend `Exception` because it is a checked exception; in other words,
    this exception requires us to handle it.

    Custom exceptions serve to define specific errors for our program
    and make the code clearer and easier to manage.

    Checked exceptions (which inherit from `Exception`) are used for errors
    from which your application can recover. For example, if a user
    uploads an image in an incorrect format, you throw an error and
    notify the client, but your server remains up and running.
 */
public class AgeValidationException extends Exception {
    public AgeValidationException(String message) {
        super(message);
    }
}
