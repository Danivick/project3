package ChatBotDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

public class ChatBot extends JFrame implements ActionListener {
    JTextField textField;
    JButton button;
    JTextArea textArea;

    public ChatBot(){
        setSize(800,800);
        setLocationRelativeTo(null);
        setVisible(true);
        setTitle("ChAt BoT");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        button = new JButton("send");
        textField = new JTextField();
        setLayout(null);

        add(textArea);
        add(textField);
        textArea.setSize(780,600);
        textArea.setLocation(1,1);
        textArea.setBackground(Color.gray);
        add(button);
        button.addActionListener(this);
        button.setSize(580,50);
        button.setLocation(100,710);
        textField.setSize(770,100);
        textField.setLocation(10,610);
    }

    public static void main(String[] args) {
        ChatBot run = new ChatBot();
    }

    public void actionPerformed(ActionEvent e){
       if (e.getSource()==button){
           String message = textField.getText().toLowerCase();
           textArea.append("You: "+ message + "\n");
           textField.setText("");

           if(message.contains("hi")){
               reply("hi there!");
           }
           else if(message.contains("how are you")){

               reply("I'm really great! thank you for asking. How are you doing today?");
           }
           else if(message.contains("your name?")){
               reply("I'm DaniBot. nice to meet you!");
           }
           else{
               reply("sorry, I don't understand");
           }
       }
    }

    public void reply(String s){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        textArea.append("chatbot: "+ s + "\n");
    }
}
