package com.devtalles.exception.proyect.service;

import com.devtalles.exception.proyect.exception.DuplicateStudentException;
import com.devtalles.exception.proyect.exception.StudentNotFoundException;
import com.devtalles.exception.proyect.domain.Student;
import com.devtalles.exception.proyect.repository.StudentRepository;

import java.util.List;

public class StudentService {
    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public Student save(Student student) {
        this.notExistingUserOrThrow(student.getId());

        return this.repository.save(student);
    }

    public Student deleteById(String id) {
        this.existUserOrThrow(id);

        return this.repository.deleteById(id);
    }

    public List<Student> getStudents() {
        return this.repository.getStudents();
    }

    private void existUserOrThrow(String id) {
        Student student = this.repository.getById(id);

        if (student == null)
            throw new StudentNotFoundException("El usuario no existe.");
    }

    private void notExistingUserOrThrow(String id) {
        Student studentExisting = this.repository.getById(id);

        if (studentExisting != null)
            throw  new DuplicateStudentException("El usuario con el id proporcionado ya existe.");
    }
}
