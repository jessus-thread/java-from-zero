package org.devtalles.proyect.task.view;

import org.devtalles.proyect.task.controller.TaskController;
import org.devtalles.proyect.task.exceptions.TaskException;
import org.devtalles.proyect.task.exceptions.TaskValidationException;
import org.devtalles.proyect.task.model.Task;

import java.util.Scanner;

public class TaskView {
    private final TaskController taskController;
    private final Scanner scanner;

    public TaskView(TaskController taskController) {
        this.taskController = taskController;
        this.scanner = new Scanner(System.in);
    }

    public void showMenu() {
        while (true) {
            System.out.println("\n Gestión de Tareas");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Eliminar tarea");
            System.out.println("3. Actualizar tarea");
            System.out.println("4. Mostrar tareas");
            System.out.println("5. Actualizar el estado de la tarea");
            System.out.println("6. Mostrar tareas completadas");
            System.out.println("7. Mostrar tareas finalizadas");
            System.out.println("8. Salir");

            System.out.println("Seleccione una opción: ");

            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    this.addTaskView();

                    break;
                case "2":
                    this.removeTaskView();

                    break;
                case "3":
                    this.updateTaskView();

                    break;
                case "4":
                    this.showTaskView();

                    break;
                case "5":
                    this.updateTaskCompletedView();

                    break;
                case "6":
                    this.showCompletedTasksView();

                    break;
                case "7":
                    this.showPendingTasksView();

                    break;
                case "8":
                    System.out.println("Saliendo del sistema.");
                    return;
                default:
                    System.out.println("Opción invalida, intente nuevamente.");

            }

        }
    }

    public void addTaskView() {
        try {
            Task task = this.getTaskInput();

            this.taskController.addTask(task.getId(), task.getTitle(), task.getDescription(), task.getCompleted());

            System.out.println("Tarea agregada correctamente");
        } catch (TaskValidationException | TaskException error) {
            System.out.println("Error: " + error.getMessage());
        } catch (Exception error) {
            System.out.println("Error inesperado, contacte con soporte");

            error.printStackTrace();
        }
    }

    public void removeTaskView() {
        try {
            System.out.println("Ingrese el id a eliminar: ");
            String id = this.scanner.nextLine();

            this.taskController.removeTask(id);

            System.out.println("Tarea eliminada correctamente");
        } catch (TaskValidationException | TaskException error) {
            System.out.println("Error: " + error.getMessage());
        } catch (Exception error) {
            System.out.println("Error inesperado, contacte con soporte");

            error.printStackTrace();
        }
    }

    public void showTaskView() {
        try {
            System.out.println("\nLa lista de tareas.");

            this.taskController.showTasks();
        } catch (TaskValidationException | TaskException error) {
            System.out.println("Error: " + error.getMessage());
        } catch (Exception error) {
            System.out.println("Error inesperado, contacte con soporte");

            error.printStackTrace();
        }
    }

    public void updateTaskView() {
        try {
            Task task = this.getTaskInput();

            this.taskController.updateTask(task.getId(), task.getTitle(), task.getDescription(), task.getCompleted());

            System.out.println("Tarea actualizada correctamente");
        } catch (TaskValidationException | TaskException error) {
            System.out.println("Error: " + error.getMessage());
        } catch (Exception error) {
            System.out.println("Error inesperado, contacte con soporte");

            error.printStackTrace();
        }
    }

    public void updateTaskCompletedView() {
        try {
            System.out.println("Ingrese el id de la tarea: ");
            String id = this.scanner.nextLine();

            Boolean completed = null;

            while (completed == null) {
                System.out.println("¿Está completada? true/false");
                String input = this.scanner.nextLine().trim().toLowerCase();

                if (input.equals("true")) {
                    completed = true;
                } else if (input.equals("false")) {
                    completed = false;
                } else {
                    System.out.println("El valor ingresado no es correcto, ingrese true o false");
                }
            }

            this.taskController.updateTaskCompleted(id, completed);

            System.out.println("Estado de la Tarea actualizada correctamente");
        } catch (TaskValidationException | TaskException error) {
            System.out.println("Error: " + error.getMessage());
        } catch (Exception error) {
            System.out.println("Error inesperado, contacte con soporte");

            error.printStackTrace();
        }
    }

    public void showCompletedTasksView() {
        System.out.println("Tareas completadas");

        try {
            this.taskController.showCompletedTasks();
        } catch (TaskValidationException | TaskException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void showPendingTasksView() {
        System.out.println("Tareas finalizadas");

        try {
            this.taskController.showPendingTasks();
        } catch (TaskValidationException | TaskException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private Task getTaskInput() {
        String id;

        do {
            System.out.println("Ingresar ID: ");

            id = this.scanner.nextLine();

            if (id.isEmpty())
                System.out.println("El id no puede estar vacío");
        } while(id.isEmpty());

        String title;

        do {
            System.out.println("Ingrese el titulo: ");
            title = this.scanner.nextLine();

            if (title.isEmpty())
                System.out.println("El titulo no puede estar vacío");
        } while (title.isEmpty());

        String description;

        do {
            System.out.println("Ingresar la descripción: ");
            description = this.scanner.nextLine();

            if (description.isEmpty())
                System.out.println("La descripción no puede estar vacía");
        } while (description.isEmpty());

        Boolean completed = null;

        while (completed == null) {
            System.out.println("¿Está completada? true/false");
            String input = this.scanner.nextLine().trim().toLowerCase();

            if (input.equals("true")) {
                completed = true;
            } else if (input.equals("false")) {
                completed = false;
            } else {
                System.out.println("El valor ingresado no es correcto, ingrese true o false");
            }
        }

        return new Task(id, title, description, completed);
    }
}
