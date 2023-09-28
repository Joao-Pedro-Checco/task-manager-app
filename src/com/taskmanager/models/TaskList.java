package com.taskmanager.models;

import java.util.ArrayList;

public class TaskList {
    private final ArrayList<Task> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public void add(Task task) {
        this.tasks.add(task);
    }

    public void remove(Task task) {
        this.tasks.remove(task);
    }

    public void list() {
        for (int i = 0; i < this.getTasks().size(); i++) {
            Task currentTask = this.getTasks().get(i);
            String taskStatus = currentTask.isCompleted() ? "[X] " : "[]  ";
            String taskInfo = ". " + currentTask.getDescription();
            System.out.println(taskStatus + (i+1) + taskInfo);
        }
    }

    public ArrayList<Task> getTasks() {
        return this.tasks;
    }
}
