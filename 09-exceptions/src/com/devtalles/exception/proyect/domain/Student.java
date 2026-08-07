package com.devtalles.exception.proyect.domain;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private final static byte MIN_AGE = 17;
    private final static byte MAX_AGE = 100;
    private final static String EXPRESSION_REGULAR_ID = "[A-Z]\\d{5}";

    private String name;
    private byte age;
    private String id;

    public Student(String name, byte age, String id) {
        Student.isValidStringOrThrow(name);
        Student.isValidAgeOrThrow(age);
        Student.isValidIdentifierOrThrow(id);

        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Student.isValidStringOrThrow(name);

        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        Student.isValidAgeOrThrow(age);

        this.age = age;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Student student = (Student)obj;

        return Objects.equals(this.id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.id);
    }

    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }

    private static void isValidIdentifierOrThrow(String id) {
        if (id == null)
            throw new IllegalArgumentException("El id no puede ser null.");

        if (!id.matches(Student.EXPRESSION_REGULAR_ID))
            throw new IllegalArgumentException(
                    "El id no cumple con el formato, primero debe ser una letra mayuscula y luego 5 numeros."
            );
    }

    private static void isValidAgeOrThrow(byte age) {
        if ( age < Student.MIN_AGE || age > Student.MAX_AGE)
            throw new IllegalArgumentException("La edad debe estar en el rango de 17 años a 100.");
    }

    private static void isValidStringOrThrow(String name) {
        if (name == null)
            throw new IllegalArgumentException("No puede proporcionar un nombre con el valor de null.");

        if (name.isBlank())
            throw new IllegalArgumentException("El nombre debe tener al menos un caracter.");
    }
}
