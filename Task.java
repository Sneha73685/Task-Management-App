import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task{
    private int id;
    private String title;
    private String description;
    private String dueDate;
    private int priority;
    private boolean completed;

    public Task(int id, String title, String description, String dueDate, int priority) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.priority = priority;
        this.completed = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public int getPriority() {
        return priority;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markAsCompleted() {
        completed = true;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", priority=" + priority +
                ", completed=" + completed +
                '}';
    }
