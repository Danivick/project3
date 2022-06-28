package GUIpackage.Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Lab8Part3 extends JFrame implements MouseMotionListener {
    JLabel label1;

   public Lab8Part3(){

       setVisible(true);
       setSize(1080,1080);
       setTitle("Hidden Label Game");
       label1 = new JLabel();
       label1.setSize(300,100);
       label1.setBounds(0,0,300,200);
       //label1.setText("You found me!");
       label1.setBackground(Color.red);
       //label1.setOpaque(true);
       setLayout(null);
       add(label1);
       label1.addMouseMotionListener(this);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void mouseDragged(MouseEvent me){
       String s = me.getX() + "" + me.getY();
       System.out.println(s);
       label1.setOpaque(true);
       label1.setText("You found me!");
       label1.setBackground(Color.yellow);
    }
    public void mouseMoved(MouseEvent me){
        String s = me.getX() + "" + me.getY();
        //label1.setText("You found me!");
        System.out.println(s);
    }

    public static void main(String[] args) {
        Lab8Part3 run = new Lab8Part3();
    }
}
