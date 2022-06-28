package GUIpackage.Listeners;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseMotionListenerExample extends JFrame implements MouseMotionListener {
    Label label1, label2;

    public MouseMotionListenerExample(){
        setTitle("Mouse Motion Listener");
        label1 = new Label("Tracking Mouse Cursor", Label.CENTER);
        label2 = new Label();

        setLayout(new FlowLayout());
        add(label1);
        add(label2);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addMouseMotionListener(this);
        setSize(300,300);
        setVisible(true);

    }

    public void mouseDragged(MouseEvent me){
        String s = me.getX() + "," + me.getY();
        label2.setText("Moused dragged " + s);
        setVisible(true);
    }
    public void mouseMoved(MouseEvent me){
        String s = me.getX() + "," + me.getY();
        label2.setText("Moused moved " + s);
        setVisible(true);
    }

    public static void main(String[] args) {
        MouseMotionListenerExample run = new MouseMotionListenerExample();
    }

}
