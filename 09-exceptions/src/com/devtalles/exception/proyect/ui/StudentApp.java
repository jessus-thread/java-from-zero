package com.devtalles.exception.proyect.ui;

import com.devtalles.exception.proyect.domain.Student;
import com.devtalles.exception.proyect.exception.DuplicateStudentException;
import com.devtalles.exception.proyect.exception.StudentNotFoundException;
import com.devtalles.exception.proyect.service.StudentService;

import java.util.InputMismatchException;
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
        int option = 0;

        do {
            try {
                this.displayMenu();

                option = this.getUserOptions();

                this.processOption(option);
            } catch (
                    DuplicateStudentException |
                    StudentNotFoundException |
                    IllegalArgumentException |
                    InputMismatchException error
            ) {
                System.out.println(error.getMessage());

                System.out.println();
                System.out.println("------------------------------------------------------------------------------");
            }
        } while (option != 4);
    }

    private void handleSave() {
        String name = this.createInputString("Nombre: ");
        byte age = this.createInputByte("Edad: ");
        String id = this.createInputString("ID: ");

        this.service.save(new Student(name, age, id));

        System.out.println("Usuario guardado correctamente...");
    }

    private void handleDelete() {
        String id = this.createInputString("Eliminar estudiante: ");

        this.service.deleteById(id);

        System.out.println("Usuario eliminado correctamente...");
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
            default: {
                System.out.println("Opción incorrecta");
            }
        }
    }

    private int getUserOptions() {
        try  {
            System.out.println("Seleccione una opción:");

            return Integer.parseInt(this.scanner.nextLine());
        } catch (Exception error) {
            throw new InputMismatchException("Por favor, coloque un número valido.");
        }
    }

    private String createInputString(String label) {
        System.out.println(label);

        return this.scanner.nextLine();
    }

    private byte createInputByte(String label) {
        try {
            System.out.println(label);

            return Byte.parseByte(this.scanner.nextLine());
        } catch (InputMismatchException error) {
            throw new InputMismatchException("Por favor, coloque un número valido.");
        }
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
