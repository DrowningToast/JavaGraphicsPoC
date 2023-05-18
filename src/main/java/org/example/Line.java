package org.example;

import javax.swing.*;
import java.awt.*;

public class Line extends JPanel {
    @Override
    protected  void paintComponent(Graphics g) {
        super.paintComponents(g);

        Graphics2D g2d = (Graphics2D) g;

        // Set line attributes
        g2d.setColor(Color.RED);
        g2d.setStroke(new BasicStroke(2)); // line thickness

        int x1 = 50; // starting x-coordinate
        int y1 = 50; // starting y-coordinate
        int x2 = 200; // ending x-coordinate
        int y2 = 200; // ending y-coordinate

        System.out.println("bruh moment");

        // Draw the line
        g2d.drawLine(x1, y1, x2, y2);
    }
}
