package GUIpackage.basics;

import javax.swing.*;

public class LabelDemo extends JFrame {
    JLabel label;
    public LabelDemo(){
        label = new JLabel();
        label.setVisible(true);
        label.setText("username");


        this.add(label);
        this.setVisible(true);
        this.setSize(500, 200);
    }

    public static void main(String[] args) {
        LabelDemo run = new LabelDemo();
    }
}
