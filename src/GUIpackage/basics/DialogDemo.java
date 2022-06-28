package GUIpackage.basics;

import javax.swing.*;

public class DialogDemo {
    JDialog dialog;
    public DialogDemo(){
        dialog = new JDialog();
        dialog.setVisible(true);
        dialog.setSize(400,400);
        dialog.setTitle("Demo Dialog");

        dialog.setResizable(false);
        dialog.setLocationRelativeTo(null);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    }

    public static void main(String[]args){
        DialogDemo run = new DialogDemo();
    }
}
