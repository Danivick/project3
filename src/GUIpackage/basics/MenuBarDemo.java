package GUIpackage.basics;

import javax.swing.*;

public class MenuBarDemo extends JFrame {
    JMenuBar menuBar;
    public MenuBarDemo(){
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        setVisible(true);
        setTitle("Menu Bar Demo");
        setSize(300, 100);

    }

    public static void main(String[] args) {
        MenuBarDemo run = new MenuBarDemo();
    }
}
