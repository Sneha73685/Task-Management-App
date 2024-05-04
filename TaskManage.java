import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskManager {
    private List<Task> tasks;
    private int nextId;

    public TaskManager() {
        tasks = new ArrayList<>();
        nextId = 1;
    }

    public void addTask(String title, String description, String dueDate, int priority) {
        Task task = new Task(nextId++, title, description, dueDate, priority);
        tasks.add(task);
    }

    public void removeTask(int taskId) {
        for (Task task : tasks) {
            if (task.getId() == taskId) {
                tasks.remove(task);
                return;
            }
        }
        System.out.println("Task not found.");
    }

    public void markTaskAsCompleted(int taskId) {
        for (Task task : tasks) {
            if (task.getId() == taskId) {
                task.markAsCompleted();
                return;
            }
        }
        System.out.println("Task not found.");
    }

    public void displayTasks() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Display Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter due date: ");
                    String dueDate = scanner.nextLine();
                    System.out.print("Enter priority (1-5): ");
                    int priority = scanner.nextInt();
                    taskManager.addTask(title, description, dueDate, priority);
                    System.out.println("Task added successfully.");
                    break;
                case 2:
                    System.out.print("Enter task ID to remove: ");
                    int taskIdToRemove = scanner.nextInt();
                    taskManager.removeTask(taskIdToRemove);
                    break;
                case 3:
                    System.out.print("Enter task ID to mark as completed: ");
                    int taskIdToComplete = scanner.nextInt();
                    taskManager.markTaskAsCompleted(taskIdToComplete);
                    break;
                case 4:
                    System.out.println("Tasks:");
                    taskManager.displayTasks();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
