package GUIpackage.Layout;

import javax.swing.*;
import java.awt.*;

public class GridBagLayoutDemo extends JFrame {
    JButton red, green, blue, yellow;

    public GridBagLayoutDemo(){
        red = new JButton("red");
        green = new JButton("green");
        blue = new JButton("blue");
        yellow = new JButton("yellow");

        setVisible(true);
        setSize(500, 500);
        setTitle("Grid Bag Layout");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       GridBagLayout layout = new GridBagLayout();
       setLayout(layout);
       GridBagConstraints c = new GridBagConstraints();

       c.gridx = 0;
       c.gridy = 0;
       add(red, c);

        c.gridx = 1;
        c.gridy = 1;
        add(green, c);

        c.gridx = 2;
        c.gridy = 2;
        add(blue, c);

        c.gridx = 3;
        c.gridy = 3;
        add(yellow, c);
    }

    public static void main(String[] args) {
        GridBagLayoutDemo run = new GridBagLayoutDemo();
    }
}
