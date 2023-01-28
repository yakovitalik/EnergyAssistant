package ru.yakovitalik.energyassist;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 * Расчет полной мощности по активной и реактивной
 */

public class Calculation2 extends JFrame {
    JButton button1, button2;
    JLabel label1, label2, label3, label4;
    JTextField text1;
    JTextField text2;
    int actionPower, reactPower, fullPower;
    String outputText1;
    EHandler handler = new EHandler();

    public Calculation2(String s) {
        super(s);
        setLayout(new FlowLayout());
        button1 = new JButton("Расчитать");
        button2 = new JButton("Очистить");
        label1 = new JLabel("Введите активную мощность, кВт:");
        label2 = new JLabel("Введите реактивную мощность, кВар:");
        label3 = new JLabel("");
        label4 = new JLabel("");
        text1 = new JTextField(10);
        text2 = new JTextField(10);

        // добавляем поля во фрейм
        add(label1);
        add(text1);
        add(label2);
        add(text2);
        add(button1);
        add(button2);
        add(label3);
        add(label4);
        button1.addActionListener(handler);  // вешаем слушатель на кнопку button1
        button2.addActionListener(handler);  // вешаем слушатель на кнопку button2
    }

    public class EHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                if(e.getSource() == button1) { // если нажатая кнопка равна button1
                    actionPower = Integer.parseInt(text1.getText());
                    reactPower = Integer.parseInt(text2.getText());
                    fullPower = (int) Math.round(Math.sqrt((actionPower * actionPower) + (reactPower * reactPower)));
                    label3.setText("_____________________________________________");
                    outputText1 = "Полная мощность равна, кВА: " + fullPower;
                    label4.setText(outputText1);
                }

                if(e.getSource() == button2) { // если нажатая кнопка равна button2
                    text1.setText(null);
                    text2.setText(null);
                    label3.setText("");
                    label4.setText("");
                }
            } catch(Exception ex) {
                JOptionPane.showMessageDialog(null, "Введите в поле число!");
            }
        }

    }
}
