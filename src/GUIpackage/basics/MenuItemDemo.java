package GUIpackage.basics;

import javax.swing.*;

public class MenuItemDemo extends JFrame {

    JMenuBar menuBar;
    JMenu filemenu, editmenu, exitmenu;
    JMenuItem openitem, closeitem, newitem, copyitem, pasteitem;

    public MenuItemDemo(){

        menuBar = new JMenuBar();

        filemenu = new JMenu("File");
        editmenu = new JMenu("Edit");
        exitmenu = new JMenu("Exit");

        newitem = new JMenuItem("New");
        openitem = new JMenuItem("Open");
        copyitem = new JMenu("Copy");
        pasteitem = new JMenu("Paste");
        closeitem = new JMenu("Close");

        filemenu.add(newitem);
        filemenu.add(openitem);
        editmenu.add(copyitem);
        editmenu.add(pasteitem);
        exitmenu.add(closeitem);

        setJMenuBar(menuBar);
        menuBar.add(filemenu);
        menuBar.add(editmenu);
        menuBar.add(exitmenu);


        setSize(400,200);
        setVisible(true);
        setTitle("Menu Item Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MenuItemDemo run = new MenuItemDemo();
    }
}
