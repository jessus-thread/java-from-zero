package com.devtalles.exception.proyect;

import java.util.List;
import java.util.Scanner;

public class StudentApp {
    private final StudentService service;
    private final Scanner scanner;

    public StudentApp(StudentService service) {
        this.service = service;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        int option;

        do {
            this.displayMenu();

            option = this.getUserOptions();

            try {
                this.processOption(option);
            } catch (StudentNotFoundException | DuplicateStudentException error) {
                System.out.println(error.getMessage());

                this.start();
            }
        } while (option != 4);
    }

    private void handleSave() {
        String name = this.createInputString("Nombre: ");
        byte age = this.createInputByte("Edad: ");
        String id = this.createInputString("ID: ");

        this.service.save(new Student(name, age, id));
    }

    private void handleDelete() {
        String id = this.createInputString("Eliminar estudiante: ");

        this.service.deleteById(id);
    }

    private void handleRenderListStudents() {
        List<Student> students = this.service.getStudents();

        for (Student student : students) {
            System.out.println(student);
        }
    }

    private void processOption(int option) {
        switch (option) {
            case 1: {
                this.handleSave();

                break;
            }
            case 2: {
                this.handleDelete();

                break;
            }
            case 3: {
                this.handleRenderListStudents();

                break;
            }
            case 4: {
                System.out.println("Gracias por utilizar la app.");

                break;
            }
            case 5: {
                System.out.println("Opción incorrecta");
            }
        }
    }

    private int getUserOptions() {
        System.out.println("Seleccione una opción:");

        return this.scanner.nextInt();
    }

    private String createInputString(String label) {
        System.out.println(label);

        return this.scanner.next();
    }

    private byte createInputByte(String label) {
        System.out.println(label);

        return this.scanner.nextByte();
    }

    private void displayMenu() {
        final String[] options = {
                "\nBienvenido al Sistema de Registro de Estudiantes",
                "1. Registrar estudiante",
                "2. Eliminar estudiante",
                "3. Mostrar todos los estudiantes",
                "4. Salir"
        };

        for (String option : options) {
            System.out.println(option);
        }
    }
}
