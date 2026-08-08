package org.devtalles.proyect;

import org.devtalles.proyect.task.controller.TaskController;
import org.devtalles.proyect.task.model.TaskRepository;
import org.devtalles.proyect.task.view.TaskView;

public class Main {
    static void main() {
        TaskRepository repository = new TaskRepository();
        TaskController controller = new TaskController(repository);
        TaskView view = new TaskView(controller);

        view.showMenu();
    }
}
