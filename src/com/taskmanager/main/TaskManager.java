package com.taskmanager.main;

import com.taskmanager.models.TaskList;
import com.taskmanager.models.Task;

import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args) {
        TaskManager app = new TaskManager();
        app.start();
    }

    public static void menu() {
        System.out.println("==========================");
        System.out.println("| Gerenciador de Tarefas |");
        System.out.println("==========================");
        System.out.println("""
                [1] Adicionar tarefa
                [2] Remover tarefa
                [3] Editar tarefa
                [4] Marcar como concluída
                [5] Listar tarefas
                [0] Sair""");
    }

    public void start() {
        menu();

        TaskList tasks = new TaskList();
        boolean running = true;
        while (running) {
            int operation = getOperation();
            switch (operation) {
                case 1:
                    tasks.add(new Task(setTaskDescription()));
                    System.out.println("--------------------------");
                    break;
                case 2:
                    int index = taskIndex();
                    tasks.remove(tasks.getTasks().get(index));
                    System.out.println("--------------------------");
                    break;
                case 3:
                    Task task = tasks.getTasks().get(taskIndex());
                    task.setDescription(setTaskDescription());
                    System.out.println("--------------------------");
                    break;
                case 4:
                    tasks.getTasks().get(taskIndex()).markAsCompleted();
                    System.out.println("--------------------------");
                    break;
                case 5:
                    tasks.list();
                    System.out.println("--------------------------");
                    break;
                default:
                    running = false;
                    System.out.println("Encerrando...");
                    break;
            }
        }
    }

    public static int taskIndex() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Número da tarefa: ");
        return scanner.nextInt() - 1;
    }

    public static String setTaskDescription() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Descrição da tarefa: ");
        return scanner.nextLine();
    }

    public static int getOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escolha uma operação: ");
        return scanner.nextInt();
    }
}
