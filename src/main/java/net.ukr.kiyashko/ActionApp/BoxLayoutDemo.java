package net.ukr.kiyashko.ActionApp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class BoxLayoutDemo extends JFrame {
    private JButton button;
    private JPanel panel = new JPanel(); // рабочая панель (блок)

    public BoxLayoutDemo(String title) {
        super(title);
        this.setSize(100, 100);// размер окна (px)
        this.setLocation(300, 300); // позиция окна (px)
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // завершение работы приложения при закрытии
        JLabel label = new JLabel("Test label"); // простой текст
        panel.add(label);// добавляем текст в панель
        button = new JButton("Open Calc"); // кнопка с названием
        button.addActionListener(new ActionListener() { //обработка события нажатия на кнопку
            @Override
            public void actionPerformed(ActionEvent e) { // метод который срабатывает по нажатию кнопки
                try {
                    Process process = Runtime.getRuntime().exec("C:\\Windows\\system32\\calc.exe");
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });
        panel.add(button); //добавление кнопки на панель
        this.add(panel); // добавление панели (со всеми елементами) в окно приложения
        this.setVisible(true); // флаг отображения окна
    }

    public static void main(String[] args) {
        new BoxLayoutDemo("Action application");
    }
}
