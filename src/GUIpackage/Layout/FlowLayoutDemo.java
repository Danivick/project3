package GUIpackage.Layout;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo extends JFrame {
    JButton add, update, delete;

    public FlowLayoutDemo(){
        add = new JButton("Add");
        update = new JButton("Update");
        delete = new JButton("Delete");

        setLayout(new FlowLayout());

        add(add);
        add(update);
        add(delete);

        setVisible(true);
        setSize(200,200);
        setTitle("Flow Layout");

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        FlowLayoutDemo run = new FlowLayoutDemo();
    }
}
