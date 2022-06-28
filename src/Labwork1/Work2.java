package Labwork1;

import javax.swing.*;
import java.awt.*;

public class Work2 extends JFrame {
    JMenuBar menuBar;
    JMenu schoolmenu, coursemenu;
    JMenuItem NIIT, HIIT, andela;
    JTextArea textArea;
    JButton button;

    public Work2(){
        menuBar = new JMenuBar();
        schoolmenu = new JMenu("School");
        coursemenu = new JMenu("Course");
        NIIT = new JMenuItem("NIIT");
        HIIT = new JMenuItem("HIIT");
        andela = new JMenuItem("Andela");
        textArea = new JTextArea();
        button = new JButton("Click Me");


        setJMenuBar(menuBar);
        menuBar.add(schoolmenu);
        menuBar.add(coursemenu);

        schoolmenu.add(NIIT);
        schoolmenu.add(HIIT);
        schoolmenu.add(andela);

        button.setSize(100,40);
        textArea.setSize(300,200);
        textArea.setVisible(true);


        this.setVisible(true);
        //this.setLayout(new FlowLayout());
        this.setSize(500, 500);
        this.setTitle("Work 2");
        this.add(textArea);
        this.add(button);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        Work2 run = new Work2();
    }
}
