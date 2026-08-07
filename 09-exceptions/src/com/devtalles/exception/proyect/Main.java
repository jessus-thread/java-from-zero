package com.devtalles.exception.proyect;

import com.devtalles.exception.proyect.repository.StudentMemoryRepository;
import com.devtalles.exception.proyect.service.StudentService;
import com.devtalles.exception.proyect.ui.StudentApp;

public class Main {
    static void main() {
        StudentMemoryRepository repository = new StudentMemoryRepository();
        StudentService service = new StudentService(repository);
        StudentApp app = new StudentApp(service);

        app.start();
    }
}
