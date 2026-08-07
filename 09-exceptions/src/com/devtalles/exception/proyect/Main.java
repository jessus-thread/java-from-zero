package com.devtalles.exception.proyect;

public class Main {
    static void main() {
        StudentMemoryRepository repository = new StudentMemoryRepository();
        StudentService service = new StudentService(repository);
        StudentApp app = new StudentApp(service);

        app.start();
    }
}
