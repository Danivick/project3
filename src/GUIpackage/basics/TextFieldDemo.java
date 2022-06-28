package GUIpackage.basics;

import javax.swing.*;
import java.awt.*;

public class TextFieldDemo extends JFrame {
    JTextField texted;
    public TextFieldDemo(){
        texted = new JTextField();
        texted.setVisible(true);
        texted.setText("username");
        texted.setForeground(Color.white);
        texted.setBackground(Color.black);

        this.add(texted);
        this.setVisible(true);
        this.setSize(300,100);
    }

    public static void main(String[] args) {
        TextFieldDemo run = new TextFieldDemo();
    }
}
