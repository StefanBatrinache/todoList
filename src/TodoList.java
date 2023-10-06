import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    private ArrayList<String> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        } else {
            System.out.println("Invalid task index.");
        }
    }

    public void viewTasks() {
        System.out.println("To-Do List:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoList todoList = new TodoList();

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Add task");
            System.out.println("2. Remove task");
            System.out.println("3. View tasks");
            System.out.println("4. Quit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter a task: ");
                    String task = scanner.nextLine();
                    todoList.addTask(task);
                    break;
                case 2:
                    System.out.print("Enter the index of the task to remove: ");
                    int index = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    todoList.removeTask(index - 1);
                    break;
                case 3:
                    System.out.println(todoList);
                    todoList.viewTasks();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}