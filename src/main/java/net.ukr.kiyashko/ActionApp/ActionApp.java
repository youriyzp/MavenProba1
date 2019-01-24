package net.ukr.kiyashko.ActionApp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ActionApp extends JFrame {
    private JButton button;
    private JPanel panel = new JPanel(); // рабочая панель (блок)
    private JComboBox list;

    public ActionApp(String title) {
        super(title);
        this.setSize(100, 100);// размер окна (px)
        this.setLocation(300, 300); // позиция окна (px)
        String[] programs = {"Select 1", "Select 2"}; // массив возможных значений селектора
        list = new JComboBox(programs); // создание селектора
        panel.add(list); // добавление селектора на панель
        button = new JButton("Test");
        button.addActionListener(e -> { // просто пример лямбда выражения, рассмотрим позже
            String prog = (String) list.getSelectedItem(); // получение выбранного елемента селектора            s
            switch (prog) {
                case "Select 1":
                    System.out.println("Select 1 was exec");
                    break;
                case "Select 2":
                    System.out.println("Select 2 was exec");
                    break;
            }
        });
        panel.add(button);
        this.add(panel); // добавление панели (со всеми елементами) в окно приложения
        this.setVisible(true); // флаг отображения окна
    }


    public static void main(String[] args) {
        new ActionApp("Action application");
    }
}
