package todolistappjdbc.dao;

import todolistappjdbc.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class TaskDaoImpl implements TaskDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addTask(Task task) {
        String sql = "INSERT INTO tasks (title, description, completed) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, task.getTitle(), task.getDescription(), task.isCompleted());
    }

    @Override
    public List<Task> getAllTasks() {
        String sql = "SELECT * FROM tasks";
        return jdbcTemplate.query(sql, (rs, rowNum) -> mapRowToTask(rs));
    }

    @Override
    public void updateTask(Task task) {
        String sql = "UPDATE tasks SET title = ?, description = ?, completed = ? WHERE id = ?";
        jdbcTemplate.update(sql, task.getTitle(), task.getDescription(), task.isCompleted(), task.getId());
    }

    @Override
    public void deleteTask(int id) {
        String sql = "DELETE FROM tasks WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public Task getTaskById(int id) {
        String sql = "SELECT * FROM tasks WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, (rs, rowNum) -> mapRowToTask(rs), id);
    }

    private Task mapRowToTask(ResultSet rs) throws SQLException {
        return new Task(
            rs.getInt("id"),
            rs.getString("title"),
            rs.getString("description"),
            rs.getBoolean("completed")
        );
    }
}
