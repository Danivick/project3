package GUIpackage.basics;

import javax.swing.*;

public class TextAreaDemo extends JFrame {
    JTextArea textArea;
    public TextAreaDemo(){
        textArea = new JTextArea();

        this.add(textArea);
        this.setVisible(true);
        this.setSize(600,200);
        this.setResizable(true);
    }

    public static void main(String[] args) {
        TextAreaDemo run = new TextAreaDemo();
    }
}
