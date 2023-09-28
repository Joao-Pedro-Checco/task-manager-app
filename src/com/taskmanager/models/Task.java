package com.taskmanager.models;

import javax.crypto.spec.PSource;

public class Task {
    private String description;
    private boolean completed;

    public Task(String description) {
        this.description = description;
        this.completed = false;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markAsCompleted() {
        if (!this.isCompleted()) {
            this.completed = true;
        } else {
            System.out.println("Tarefa já marcada como concluída");
        }
    }

    @Override
    public String toString() {
        return this.completed ? "[X] " : "[]  " + this.description;
    }
}
