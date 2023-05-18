package org.example;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    public Window() {
        this.setSize(new Dimension(200, 200));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.getContentPane().add(line);
        this.add(new Line());
        this.setVisible(true);
    }


}
