package com.taskmanager.main;

import com.taskmanager.graphics.MainWindow;

import javax.swing.*;

public class TaskManager {
    public static void main(String[] args) {
        TaskManager app = new TaskManager();
        app.start();
    }

    private void start() {
        int WIDTH = 800;
        int HEIGHT = 500;
        String title = "Task Manager";
        ImageIcon logo = new ImageIcon("src/com/taskmanager/assets/logo.png");
        int bgColor = 0xd3d3d3;
        MainWindow window = new MainWindow(WIDTH, HEIGHT, title, logo, bgColor);
        window.init();
    }
}
