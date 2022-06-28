package GUIpackage.Events;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseMotionDemo extends JFrame implements MouseMotionListener {
    int x, y;
    JLabel position;

    public MouseMotionDemo(){

        super ("Mouse Motion Demo");
        position = new JLabel();
        setLayout(new FlowLayout());

        add(position);

        setSize(300,300);
        setVisible(true);

        //SOME CODE TO BE ADDED
    }

    public void mouseMoved(MouseEvent me){
        x = me.getX();
        y = me.getY();
        position.setText("Mouse cursor is at " + x + " " + y);
    }
    public void mouseDragged(MouseEvent me){
        x = me.getX();
        y = me.getY();
        position.setText("Mouse is dragged at " + x + " " + y);
    }

    public static void main(String[] args) {
        MouseMotionDemo run = new MouseMotionDemo();
    }
}
