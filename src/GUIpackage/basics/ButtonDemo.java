package GUIpackage.basics;

import javax.swing.*;

public class ButtonDemo extends JFrame {
    JButton button;
    public ButtonDemo(){
        button = new JButton();
        button.setText("Accept");

        this.setVisible(true);
        this.setSize(400,100);
        this.add(button);
    }

    public static void main(String[] args) {
        ButtonDemo run = new ButtonDemo();
    }
}
