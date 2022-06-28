package Labwork1;

import javax.swing.*;
import java.awt.*;

public class Work1 extends JFrame {
    JLabel label, label2;
    JTextField textField, textField2;
    JButton submitbt;

    public Work1(){
        label = new JLabel();
        label.setVisible(true);
        label.setText("Username");
        label2 = new JLabel();
        label2.setVisible(true);
        label2.setText("Password");

        textField = new JTextField();
        textField.setText("input username");
        textField2 = new JTextField();
        textField2.setText("input password");

        submitbt = new JButton();
        submitbt.setText("Submit");


        this.setVisible(true);
        this.setTitle("Sign In");
        this.setSize(200,200);
        this.add(label);
        this.add(textField);
        this.setLayout(new FlowLayout());
        this.add(label2);
        this.add(textField2);
        this.add(submitbt);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Work1 run = new Work1();
    }
}
