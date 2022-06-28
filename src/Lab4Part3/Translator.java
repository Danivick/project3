package Lab4Part3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;

public class Translator extends JFrame implements ActionListener {
    JLabel label1, label2, label3;
    JButton button1, button2;

    public Translator(){
        setTitle("Translator");
        setVisible(true);
        setSize(800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label1.setText("three");
        label2.setText("Four");
        label3.setText("Five");
        button1 = new JButton("Translate to French");
        button2 = new JButton("Translate to Spanish");
        button1.addActionListener(this);
        button2.addActionListener(this);
        setLayout(new FlowLayout());

        add(label1);
        add(label2);
        add(label3);
        add(button1);
        add(button2);
    }

    public static void main(String[] args) {
        Translator run = new Translator();
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== button1){
            ResourceBundle rb = ResourceBundle.getBundle("languagesbundle_fr");
            System.out.println(rb.getString("s1"));
}
    }
}
