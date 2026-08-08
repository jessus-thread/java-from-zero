package com.devtalles.project;

import java.util.List;

public class Person {
    private String name;
    private byte age;
    private boolean student;
    private String email;
    private List<String> hobbies;

    public Person(String name, byte age, boolean student) {
        this.name = name;
        this.age = age;
        this.student = student;
    }

    public Person(String name, byte age, boolean student, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.student = student;
        this.hobbies = hobbies;
    }

    public Person(String name, byte age, boolean student, String email, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.student = student;
        this.email = email;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public boolean isStudent() {
        return student;
    }

    public void setStudent(boolean student) {
        this.student = student;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "com.devtalles.project.Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", student=" + student +
                '}';
    }
}
