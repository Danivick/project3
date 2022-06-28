package GUIpackage.basics;

import javax.swing.*;

public class JFrameDemo {
    static JFrame frame;

    public JFrameDemo(){
        frame = new JFrame();

        //basic JFrame creation methods
        frame.setVisible(true);
        frame.setTitle("Demo1");
        frame.setSize(1080,1080);

        //other methods
        frame.setLocationRelativeTo(null); //set to center of screen
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
    public static void main(String[]args){
JFrameDemo run = new JFrameDemo();
    }
}
