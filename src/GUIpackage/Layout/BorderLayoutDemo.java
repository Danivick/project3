package GUIpackage.Layout;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo extends JFrame {
    JButton add, update, delete, reset, download;

    public BorderLayoutDemo(){
        reset = new JButton("reset");
        add = new JButton("add");
        update = new JButton("update");
        delete = new JButton("delete");
        download = new JButton("download");

        setVisible(true);
        setSize(500,500);
        setLocationRelativeTo(null);
        setTitle("Border Layout Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BorderLayout layout = new BorderLayout();
        setLayout(layout);

        add(add, BorderLayout.NORTH);
        add(reset, BorderLayout.EAST);
        add(delete, BorderLayout.SOUTH);
        add(update, BorderLayout.WEST);
        add(download, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        BorderLayoutDemo run = new BorderLayoutDemo();
    }
}
