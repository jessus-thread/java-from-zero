package org.devtalles.proyect.task.model;

import org.devtalles.proyect.task.exceptions.TaskException;
import org.devtalles.proyect.task.persistence.TaskPersistence;

import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    List<Task> tasks;

    public TaskRepository() {
        this.tasks = TaskPersistence.loadTasks();
    }

    public void save(Task task) throws TaskException {
        if (task == null)
            throw new TaskException("La tarea no puede ser null.");

        if (tasks.contains(task))
            throw new TaskException("La tarea ya existe en nuestra bd");

        this.tasks.add(task);
        TaskPersistence.saveTasks(this.tasks);
    }

    public Task findById(String id) {
        for (Task task : this.tasks) {
            if (task.getId().equals(id)) return task;
        }

        return null;
    }

    public List<Task> findCompletedTasks() throws TaskException {
        List<Task> completedTasks = new ArrayList<>();

        for (Task task : this.tasks) {
            if (task.getCompleted()) {
                completedTasks.add(task);
            }
        }

        if (completedTasks.isEmpty())
            throw new TaskException("No hay tareas completadas");

        return completedTasks;
    }

    public List<Task> findPendingTasks() throws TaskException {
        List<Task> pendingTasks = new ArrayList<>();

        for (Task task : this.tasks) {
            if (!task.getCompleted()) {
                pendingTasks.add(task);
            }
        }

        if (pendingTasks.isEmpty())
            throw new TaskException("No hay tareas pendientes");

        return pendingTasks;
    }

    public void remove(String id) throws TaskException {
        Task task = this.findById(id);

        if (task == null)
            throw new TaskException("La tarea no puede ser null.");

        this.tasks.remove(task);
        TaskPersistence.saveTasks(this.tasks);
    }

    public void remove(Task task) throws TaskException {
        if (task == null)
            throw new TaskException("La tarea no puede ser null.");

        if (!this.tasks.contains(task))
            throw new TaskException("La tarea no existe en la lista");

        this.tasks.remove(task);
        TaskPersistence.saveTasks(this.tasks);
    }

    public List<Task> findAll() throws TaskException {
        if (tasks.isEmpty())
            throw new TaskException("La lista esta vacía.");

        return this.tasks;
    }

    public int findIndexById(String id) {
        for (int i = 0; i < this.tasks.size(); i++) {
            if (tasks.get(i).getId().equals(id)) return i;
        }

        return -1;
    }

    public void updateTask(Task task) throws TaskException {
        if (task == null)
            throw new TaskException("La tarea no puede ser null.");

        int index = findIndexById(task.getId());

        if (index == -1)
            throw new TaskException("El índice no es válido");

        this.tasks.set(index, task);
        TaskPersistence.saveTasks(this.tasks);
    }

    public void updateTaskCompleted(String id, Boolean completed) throws TaskException {
        int index = findIndexById(id);

        if (index == -1)
            throw new TaskException("El índice no es válido");

        this.tasks.get(index).setCompleted(completed);
        TaskPersistence.saveTasks(this.tasks);
    }
}
