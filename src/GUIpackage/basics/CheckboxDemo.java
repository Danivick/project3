package GUIpackage.basics;

import javax.swing.*;

public class CheckboxDemo extends JFrame {
    JCheckBox checkBox;
    public CheckboxDemo(){
        checkBox = new JCheckBox();
        checkBox.setText("I am not a robot");
        checkBox.setFocusable(false);

        this.add(checkBox);
        this.setVisible(true);
        this.setTitle("Check Box");
        this.setSize(400, 100);
    }

    public static void main(String[] args) {
        CheckboxDemo run = new CheckboxDemo();
    }
}
