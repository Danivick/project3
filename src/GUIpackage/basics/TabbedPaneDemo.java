package GUIpackage.basics;

import javax.swing.*;

public class TabbedPaneDemo extends JFrame {
    JTabbedPane tabbedpane;

    public TabbedPaneDemo(){
        tabbedpane = new JTabbedPane(JTabbedPane.BOTTOM);
        tabbedpane.addTab("Tab1", null);
        tabbedpane.addTab("Tab2", null);
        tabbedpane.setSize(400, 400);

        setSize(400, 400);
        setTitle("Tabbed Pane");
        setVisible(true);
        add(tabbedpane);
    }
    public static void main(String[] args) {
        TabbedPaneDemo run = new TabbedPaneDemo();
    }

}
