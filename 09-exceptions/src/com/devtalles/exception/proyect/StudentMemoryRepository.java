package com.devtalles.exception.proyect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentMemoryRepository implements StudentRepository{
    private Map<String, Student> students = new HashMap<>();

    @Override
    public Student save(Student student) {
        this.students.put(student.getId(), student);

        return student;
    }

    @Override
    public Student deleteById(String id) {
        return this.students.remove(id);
    }

    @Override
    public Student getById(String id) {
        return this.students.get(id);
    }

    @Override
    public List<Student> getStudents() {
        return new ArrayList<>(this.students.values());
    }
}
