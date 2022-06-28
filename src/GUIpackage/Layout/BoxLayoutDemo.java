package GUIpackage.Layout;

import javax.swing.*;


public class BoxLayoutDemo extends JFrame {
    JButton red, green, blue, yellow;

    public BoxLayoutDemo(){
        red = new JButton("red");
        green = new JButton("green");
        blue = new JButton("blue");
        yellow = new JButton("yellow");

        setVisible(true);
        setSize(500,500);
        setLocationRelativeTo(null);
        setTitle("Box Layout Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BoxLayout layout = new BoxLayout(getContentPane(), BoxLayout.Y_AXIS);
        setLayout(layout);

        add(red);
        add(green);
        add(blue);
        add(yellow);
    }

    public static void main(String[] args) {
        BoxLayoutDemo run = new BoxLayoutDemo();
    }
}
