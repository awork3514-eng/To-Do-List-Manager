/*
1.This file defines the generic `TodoListManager` class that can manage tasks of any type.
*/

import java.util.ArrayList;

public class TodoListManager<T> {
    private final ArrayList<T> tasks;

    public TodoListManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(T task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the list.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }
    public void deleteTask(int taskNumber) {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the list.");
            return;
        }
        if (taskNumber < 1 || taskNumber > tasks.size()) {
            System.out.println("Invalid task number.");
            return;
        }
        T removed = tasks.remove(taskNumber - 1);
        System.out.println("Task deleted: " + removed);
    }
}