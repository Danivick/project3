package GUIpackage.basics;

import javax.swing.*;

public class PanelDemo extends JFrame {
    JPanel panel;
    public PanelDemo(){
        panel = new JPanel();
        setSize(500, 500);
        setVisible(true);
        setTitle("Panel Demo");

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
     public static void main(String[] args) {
        PanelDemo run = new PanelDemo();
    }
}
