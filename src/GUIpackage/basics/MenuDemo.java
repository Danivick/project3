package GUIpackage.basics;

import javax.swing.*;

public class MenuDemo extends JFrame {
    JMenuBar menuBar;
    JMenu filemenu, editmenu, exitmenu;

    public MenuDemo(){
        menuBar = new JMenuBar();//object of our JMenuBar

        //creating objects of JMenu and assigning title
        filemenu = new JMenu("File");
        editmenu = new JMenu("Edit");
        exitmenu = new JMenu("Exit");

        setJMenuBar(menuBar);
        menuBar.add(filemenu);
        menuBar.add(editmenu);
        menuBar.add(exitmenu);

        setSize(600, 200);
        setVisible(true);
        setTitle("Menu Bar");
    }

    public static void main(String[] args) {
        MenuDemo run = new MenuDemo();
    }
}
