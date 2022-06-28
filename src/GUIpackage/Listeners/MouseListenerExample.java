package GUIpackage.Listeners;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerExample extends JFrame implements MouseListener {
    JLabel label;

    public MouseListenerExample(){
        setTitle("Mouse Listener");
        setSize(300,300);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       label = new JLabel("Initial Text");
       add(label);
       addMouseListener(this);
    }

    public static void main(String[] args) {
        MouseListenerExample run = new MouseListenerExample();
    }
    @Override
    public void mouseClicked(MouseEvent e){
        label.setText("clicked");
    }
    @Override
    public void mousePressed(MouseEvent e){
        label.setText("Pressed");
    }
    @Override
    public void mouseReleased(MouseEvent e){
        label.setText("Released");
    }
    @Override
    public void mouseEntered(MouseEvent e){
        label.setText("Entered");
    }
    @Override
    public void mouseExited(MouseEvent e){
        label.setText("Exited");
    }

}
