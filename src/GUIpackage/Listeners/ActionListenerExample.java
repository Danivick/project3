package GUIpackage.Listeners;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerExample extends JFrame implements ActionListener {
    Button btn;
    TextField text;
    int count;

    public ActionListenerExample(){
        setTitle("ActionListener Example");
        setSize(300,300);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());
        btn = new Button("click");
        text = new TextField(30);

        btn.addActionListener(this);
        add(text);
        add(btn);
    }

    public static void main(String[] args) {
        ActionListenerExample run = new ActionListenerExample();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("clicked");
        count += 1;
        if (count < 2) {
            text.setText("clicked " + count + " " + "time");
        } else {
            text.setText("clicked " + count + " " + "times");
        }
    }

}
