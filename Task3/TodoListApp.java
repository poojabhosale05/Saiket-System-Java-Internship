import java.util.ArrayList;
import java.util.Scanner;

class Task {
    String title;
    boolean completed;

    Task(String title) {
        this.title = title;
        this.completed = false;
    }

    void markComplete() {
        completed = true;
    }

    void displayTask() {
        System.out.println(title + " - " +
                (completed ? "Completed" : "Pending"));
    }
}

public class TodoListApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Task> tasks = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== TO-DO LIST =====");
            System.out.println("1. Add Task");
            System.out.println("2. Mark Task Complete");
            System.out.println("3. Display Tasks");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Task Title: ");
                    String title = sc.nextLine();

                    tasks.add(new Task(title));

                    System.out.println("Task Added Successfully!");
                    break;

                case 2:

                    if (tasks.isEmpty()) {
                        System.out.println("No Tasks Available!");
                        break;
                    }

                    System.out.println("Task List:");

                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i).title);
                    }

                    System.out.print("Enter Task Number to Complete: ");
                    int taskNumber = sc.nextInt();

                    if (taskNumber > 0 && taskNumber <= tasks.size()) {
                        tasks.get(taskNumber - 1).markComplete();
                        System.out.println("Task Marked as Completed!");
                    } else {
                        System.out.println("Invalid Task Number!");
                    }

                    break;

                case 3:

                    if (tasks.isEmpty()) {
                        System.out.println("No Tasks Available!");
                    } else {
                        System.out.println("\nTask List:");

                        for (Task task : tasks) {
                            task.displayTask();
                        }
                    }

                    break;

                case 4:
                    System.out.println("Exiting Application...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}