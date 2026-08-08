package org.devtalles.proyect.task.controller;

import org.devtalles.proyect.task.exceptions.TaskException;
import org.devtalles.proyect.task.exceptions.TaskValidationException;
import org.devtalles.proyect.task.model.Task;
import org.devtalles.proyect.task.model.TaskRepository;

import java.util.List;

public class TaskController {
    private final TaskRepository taskRepository;

    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public void addTask(String id, String title, String description, Boolean completed) throws TaskValidationException, TaskException {
        this.validateTaskData(id, title, description, completed);

        Task task = new Task(id, title, description, completed);

        this.taskRepository.save(task);

        System.out.println("La tarea fue agregada exitosamente.");
    }

    public void removeTask(String id) throws TaskValidationException, TaskException {
        if (id == null || id.trim().isEmpty())
            throw new TaskValidationException("El id no puede estar vació");

        this.taskRepository.remove(id);
    }

    public void showTasks() throws TaskValidationException, TaskException {
        List<Task> tasks = this.taskRepository.findAll();

        if (tasks.isEmpty())
            throw new TaskValidationException("La lista no puede estar vacía");

        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public void showCompletedTasks() throws TaskValidationException, TaskException {
        List<Task> completedTasks = this.taskRepository.findCompletedTasks();

        for (Task task : completedTasks) {
            System.out.println(task);
        }
    }

    public void showPendingTasks() throws TaskValidationException, TaskException {
        List<Task> pendingTasks = this.taskRepository.findPendingTasks();

        for (Task task : pendingTasks) {
            System.out.println(task);
        }
    }

    public void updateTask(String id, String title, String description, Boolean completed) throws TaskValidationException, TaskException {
        this.validateTaskData(id, title, description, completed);

        Task updateTask = new Task(id, title, description, completed);

        this.taskRepository.updateTask(updateTask);
    }

    public void updateTaskCompleted(String id, Boolean completed) throws TaskValidationException, TaskException {
        this.validateTaskData(id, completed);

        this.taskRepository.updateTaskCompleted(id, completed);
    }

    private void validateTaskData(String id, String title, String description, Boolean completed) throws TaskValidationException {
        if (id == null || id.trim().isEmpty())
            throw new TaskValidationException("El id no puede estar vació");

        if (title == null || title.trim().isEmpty())
            throw new TaskValidationException("El título no puede estar vació");

        if (description == null || description.trim().isEmpty())
            throw new TaskValidationException("La descripción no puede estar vació");

        if (completed == null)
            throw new TaskValidationException("El estado no puede ser nulo");
    }

    private void validateTaskData(String id, Boolean completed) throws TaskValidationException {
        if (id == null || id.trim().isEmpty())
            throw new TaskValidationException("El id no puede estar vació");

        if (completed == null)
            throw new TaskValidationException("El estado no puede ser nulo");
    }
}










