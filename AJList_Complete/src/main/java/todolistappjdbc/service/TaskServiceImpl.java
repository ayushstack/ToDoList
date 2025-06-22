package todolistappjdbc.service;

import todolistappjdbc.dao.TaskDao;
import todolistappjdbc.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskDao taskDao;

    @Override
    public void addTask(Task task) {
        taskDao.addTask(task);
    }

    @Override
    public List<Task> getAllTasks() {
        return taskDao.getAllTasks();
    }

    @Override
    public void updateTask(Task task) {
        taskDao.updateTask(task);
    }

    @Override
    public void deleteTask(int id) {
        taskDao.deleteTask(id);
    }

    @Override
    public Task getTaskById(int id) {
        return taskDao.getTaskById(id);
    }
}
