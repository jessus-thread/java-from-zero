package com.devtalles.exception.proyect;

import java.util.List;

public interface StudentRepository {
    Student save(Student student);

    Student deleteById(String id);

    Student getById(String id);

    List<Student> getStudents();
}
