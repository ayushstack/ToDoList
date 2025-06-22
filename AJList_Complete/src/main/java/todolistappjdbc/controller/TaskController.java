package todolistappjdbc.controller;

import todolistappjdbc.model.Task;
import todolistappjdbc.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    // Redirect root /tasks/ to /tasks
    @GetMapping("/")
    public String redirectToTasks() {
        return "redirect:/tasks";
    }

    // List tasks page
    @GetMapping
    public String showTaskList(Model model) {
        model.addAttribute("tasks", taskService.getAllTasks());
        model.addAttribute("newTask", new Task());
        return "tasks";
    }

    // Add task POST
    @PostMapping("/add")
    public String addTask(@ModelAttribute("newTask") Task task) {
        task.setCompleted(false);
        taskService.addTask(task);
        return "redirect:/tasks";
    }

    // Mark task done/undone by id
    @GetMapping("/done/{id}")
    public String markDone(@PathVariable("id") int id) {
        Task task = taskService.getTaskById(id);
        task.setCompleted(!task.isCompleted());
        taskService.updateTask(task);
        return "redirect:/tasks";
    }

    // Delete task by id
    @GetMapping("/delete/{id}")
    public String deleteTask(@PathVariable("id") int id) {
        taskService.deleteTask(id);
        return "redirect:/tasks";
    }
}
