package GUIpackage.Layout;

import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo extends JFrame {
    JButton red, yellow, green, blue, orange, indigo, violet, purple;

    public GridLayoutDemo(){
        red = new JButton("red");
        green = new JButton("green");
        blue = new JButton("blue");
        yellow = new JButton("yellow");
        orange = new JButton("orange");
        indigo = new JButton("indigo");
        violet = new JButton("violet");
        purple = new JButton("purple");

        setVisible(true);
        setSize(500, 500);
        setTitle("GridLayout Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        GridLayout layout = new GridLayout(4,2);
        setLayout(layout);

        add(red);
        add(green);
        add(blue);
        add(yellow);
        add(orange);
        add(indigo);
        add(violet);
        add(purple);
    }

    public static void main(String[] args) {
        GridLayoutDemo run = new GridLayoutDemo();
    }
}
