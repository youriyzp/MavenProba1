package net.ukr.kiyashko.jdbc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class basa extends JFrame implements ActionListener {
    static JTextField textField;
    static JFrame frame;
    static JButton button;
    static JLabel label;
    private JPanel panel = new JPanel();

       /* String  name;
        private JButton button;
        private JPanel panel = new JPanel(); // рабочая панель (блок)
        private JComboBox list;*/

    public basa(String name) {
                super(name);
        this.setSize();
        this.setLocation();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // private String frame;

        JLabel label = new JLabel("User name");
        panel.add(label);
        button = new JButton();
        panel.add(button);
        this.add(panel);
        this.setVisible(true);


    }

    private void setLocation() {
    }

    private void setSize() {
    }

    public static void main(String[] args) {
        frame = new JFrame("username");
        label = new JLabel("Введите ваше имя");
       // frame2 = new JFrame("e-mail");
       // label2 = new JLabel("e-mail");
      //  frame3 = new JFrame("password");
        //label3 = new JLabel("Введите пароль")
        button = new JButton("submit");
       // Basa app = new Basa();
       // button.addActionListener(app); //добавляем слушателя на кнопку
        textField = new JTextField(16);
        JPanel p = new JPanel();
        p.add(textField);
        p.add(button);
        p.add(label);
        frame.add(p);
        frame.setSize(300, 300);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}


