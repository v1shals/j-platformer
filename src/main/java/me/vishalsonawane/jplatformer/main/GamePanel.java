package me.vishalsonawane.jplatformer.main;

import java.awt.Graphics;

import javax.swing.JPanel;

import me.vishalsonawane.jplatformer.inputs.KeyboardInputs;

public class GamePanel extends JPanel {

    public GamePanel() {
        super.addKeyListener(new KeyboardInputs());
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillRect(100, 100, 200, 50);
    }
}
