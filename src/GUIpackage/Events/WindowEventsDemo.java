package GUIpackage.Events;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowEventsDemo extends WindowAdapter {
    JFrame jf;

    public WindowEventsDemo(){
        jf = new JFrame("Window Event Demo");
        jf.setSize(300,300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

    }

    public void WindowClosing(WindowEvent e){
        int n = JOptionPane.showConfirmDialog(jf, "Are you sure you want to close this window?",
                "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (n == JOptionPane.YES_OPTION){
            jf.dispose();
        }
    }

    public static void main(String[] args) {
        WindowEventsDemo run = new WindowEventsDemo();
    }

}
