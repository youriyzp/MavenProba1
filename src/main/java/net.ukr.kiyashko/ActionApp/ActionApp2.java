package net.ukr.kiyashko.ActionApp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ActionApp2 extends JFrame implements ActionListener {
    static JTextField textField;
    static JFrame frame;
    static JButton button;
    static JLabel label;

    public static void main(String[] args) {
        frame = new JFrame("textfield");
        label = new JLabel("Нужно ввести текст");
        button = new JButton("submit");
        ActionApp2 app = new ActionApp2();
        button.addActionListener(app); //добавляем слушателя на кнопку
        textField = new JTextField(16);
        JPanel p = new JPanel();
        p.add(textField);
        p.add(button);
        p.add(label);
        frame.add(p);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if (s.equals("submit")) {
            label.setText(textField.getText());
        }
    }
}
