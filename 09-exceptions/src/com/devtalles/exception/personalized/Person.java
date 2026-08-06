package com.devtalles.exception.personalized;

public class Person {
    private Integer age;
    private String name;

    public Person(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    /*
        Es incorrecto que nosotros controlemos los errores dentro de los metodos
        que realizan cierta tarea en especifico, lo correcto es que los metodos
        informen el tipo de error que lanzaran.

        Esto es una excepcion de tipo checked
     */
    public static Person createPerson(String name, Integer age) throws AgeValidationException {
        if (age < 18) {
            throw new AgeValidationException("Debés ser mayor de edad.");
        }

        return new Person(age, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
