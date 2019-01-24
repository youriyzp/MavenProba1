package net.ukr.kiyashko.com.brainacad.myswing;



import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MyApplication extends JFrame implements ActionListener {
    String  name;
    private JButton button;
    private JPanel panel = new JPanel(); // рабочая панель (блок)
    private JComboBox list;

    public  MyApplication(String name){
        super(name);
        this.setSize(1200,1000);
        this.setLocation(600,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Run a Program");
        panel.add(label);
        button = new JButton("RUN");
        String[] programs = {"Calc.exe", "Notepade.exe"};
        list = new JComboBox(programs);
        panel.add(list);
        button.addActionListener(e -> {
            String prog = (String) list.getSelectedItem();
            switch (prog) {
                case "Calc.exe":
                    try {
                        Process process = Runtime.getRuntime().exec("C:\\Windows\\system32\\calc.exe");
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    break;
                case "Notepade.exe":
                    try {
                        Process process = Runtime.getRuntime().exec("C:\\Windows\\system32\\notepad.exe");
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    break;
            }
        });
        panel.add(button);
        this.add(panel);
        this.setVisible(true);


    }

    public static void main(String[] args) {new MyApplication("MY application");

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
