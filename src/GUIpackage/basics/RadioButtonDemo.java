package GUIpackage.basics;

import javax.swing.*;

public class RadioButtonDemo extends JFrame {
    JRadioButton radioButton;
    public RadioButtonDemo(){
        radioButton = new JRadioButton();
        radioButton.setText("above 18");

        this.setVisible(true);
        this.setSize(600,200);
        this.setTitle("Radio Button Demo");
        this.add(radioButton);
    }

    public static void main(String[] args) {
        RadioButtonDemo run = new RadioButtonDemo();
    }
}
