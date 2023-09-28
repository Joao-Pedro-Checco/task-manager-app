package com.taskmanager.graphics;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private final int width;
    private final int height;
    private final String title;
    private final ImageIcon logo;
    private final int bgColor;

    public MainWindow(int width, int height, String title, ImageIcon logo, int bgColor) {
        this.width = width;
        this.height = height;
        this.title = title;
        this.logo = logo;
        this.bgColor = bgColor;
    }

    public void init() {
        this.setTitle(this.title); // dá um título para o frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // encerra o programa quando fecha a janela
        this.setSize(this.width, this.height); // dimensões x e y do frame
        this.setVisible(true); // deixa o frame visível
        this.setIconImage(this.logo.getImage()); // troca o ícone da janela pelo ícone escolhido
        this.getContentPane().setBackground(new Color(this.bgColor));
    }
}
