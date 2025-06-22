package todolistappjdbc.dao;

import todolistappjdbc.model.Task;
import java.util.List;

public interface TaskDao {
    void addTask(Task task);
    List<Task> getAllTasks();
    void updateTask(Task task);
    void deleteTask(int id);
    Task getTaskById(int id);
}
