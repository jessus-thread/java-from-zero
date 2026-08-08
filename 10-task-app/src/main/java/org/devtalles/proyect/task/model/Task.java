package org.devtalles.proyect.task.model;

import java.util.Objects;

public class Task {
    private String id;
    private String title;
    private String description;
    private Boolean completed;

    public Task(String id, String title, String description, Boolean completed) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.completed = completed;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    /*
        Necesitamos aclarar no es estrictamente necesario implementar
        "hashCode" si solo vamos a utilizar una "ArrayList" y no
        planeamos usar colecciones basadas en hash, sin embargo es una
        buena practica implementar hashCode siempre que sobreescribimos
        "equals" por que entre equals y hashCode hay un contrato, este contrato
        establece que si son dos objetos iguales según equals
        deben tener el mismo hashCode, tambien establece que si dos objetos
        tienen el mismo hashCode no necesariamente deben ser iguales según equals,
        si nosotros solo sobreescribimos equals pero no hashCode estamos rompiendo
        este contrato lo que puede causar en el futuro comportamientos inesperados
        si es que vamos a implementar algún hash
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;

        return Objects.equals(id, task.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Task{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", completed=" + completed +
                '}';
    }
}
