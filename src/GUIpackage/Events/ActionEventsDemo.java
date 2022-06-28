package GUIpackage.Events;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventsDemo extends JFrame implements ActionListener {
    JButton click;
    JPanel panel;
    JLabel message;

    public ActionEventsDemo(){
        super("Action Events Demo");
        click = new JButton("Click");
        panel = new JPanel();
        message = new JLabel();

        add(panel);
        panel.add(click);
        panel.add(message);

        setSize(300, 300);
        setVisible(true);

        //SOME CODE TO BE ADDED
    }

    public void actionPerformed(ActionEvent e) {
        message.setText("welcome to event handling in Java");
    }

    public static void main(String[] args) {
        ActionEventsDemo run = new ActionEventsDemo();
    }
}
