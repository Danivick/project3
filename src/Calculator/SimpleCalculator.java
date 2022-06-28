package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame implements ActionListener {
    JTextField textField;
    JButton addbt, subtractbt, multiplybt, dividebt, equalsbt, clearbt;
    JButton[] numButtons = new JButton[10];
    JButton[] functionButtons = new JButton[6];
    JPanel panel1;

    double num1, num2, result;
    char operator;

    public SimpleCalculator(){
        setTitle("Calculator");
        setSize(720,800);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField = new JTextField();
        textField.setBounds(50,20,600,60);
        textField.setEditable(false);
        add(textField);

        addbt = new JButton("+");
        subtractbt = new JButton("-");
        multiplybt = new JButton("x");
        dividebt = new JButton("/");
        equalsbt = new JButton("=");
        clearbt = new JButton("clear");

        functionButtons[0] = addbt;
        functionButtons[1] = subtractbt;
        functionButtons[2] = multiplybt;
        functionButtons[3] = dividebt;
        functionButtons[4] = equalsbt;
        functionButtons[5] = clearbt;

        for(int i = 0; i<6; i++){
            functionButtons[i].addActionListener(this);
        }
        for(int i = 0; i<10; i++){
            numButtons[i]= new JButton(String.valueOf(i));
            numButtons[i].addActionListener(this);
        }

        clearbt.setBounds(300, 700,100,50);
        add(clearbt);

        panel1 = new JPanel();
        panel1.setBounds(50,100,600,600);
        panel1.setLayout(new GridLayout(4,4));
        panel1.setBackground(Color.gray);
        add(panel1);

        panel1.add(numButtons[1]);
        panel1.add(numButtons[2]);
        panel1.add(numButtons[3]);
        panel1.add(addbt);
        panel1.add(numButtons[4]);
        panel1.add(numButtons[5]);
        panel1.add(numButtons[6]);
        panel1.add(subtractbt);
        panel1.add(numButtons[7]);
        panel1.add(numButtons[8]);
        panel1.add(numButtons[9]);
        panel1.add(multiplybt);
        panel1.add(dividebt);
        panel1.add(numButtons[0]);
        panel1.add(equalsbt);

        setVisible(true);
    }

    public static void main(String[] args) {
        SimpleCalculator run = new SimpleCalculator();
    }
    public void actionPerformed(ActionEvent e){
        for (int i = 0; i < 10; i++) {
            if(e.getSource() == numButtons[i]) {
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }
        if (e.getSource() == addbt){
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        }
        if (e.getSource() == subtractbt){
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }
        if (e.getSource() == multiplybt){
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        }
        if (e.getSource() == dividebt){
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        }
        if (e.getSource() == equalsbt){
            num2 = Double.parseDouble(textField.getText());
           switch(operator){
               case '+':
                   result = num1 + num2;
                   break;

               case '-':
                   result = num1 - num2;
                   break;

               case '*':
                   result = num1 * num2;
                   break;

               case '/':
                   result = num1 / num2;
                   break;
           }
           textField.setText(String.valueOf(result));
           num1 = result;

        }
        if (e.getSource() == clearbt){
            textField.setText("");
        }
    }
}
