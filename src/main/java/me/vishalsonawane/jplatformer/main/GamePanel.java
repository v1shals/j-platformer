package me.vishalsonawane.jplatformer.main;

import java.awt.Graphics;

import javax.swing.JPanel;

import me.vishalsonawane.jplatformer.inputs.KeyboardInputs;
import me.vishalsonawane.jplatformer.inputs.MouseInputs;

public class GamePanel extends JPanel {

    private int xDelta = 100;

    private int yDelta = 100;

    public GamePanel() {
        MouseInputs mouseInputs = new MouseInputs(this);
        super.addMouseListener(mouseInputs);
        super.addMouseMotionListener(mouseInputs);
        super.addKeyListener(new KeyboardInputs(this));
    }

    public void changeXDelta(int value) {
        this.xDelta += value;
        super.repaint();
    }

    public void changeYDelta(int value) {
        this.yDelta += value;
        super.repaint();
    }

    public void setRectPos(int x, int y) {
        this.xDelta = x;
        this.yDelta = y;
        super.repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillRect(xDelta, yDelta, 200, 50);
    }
}
