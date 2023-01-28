package ru.yakovitalik.energyassist;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

/*
 * Расчет тока и косинуса по активной и реактивной мощностям
 */

public class Calculation3 extends JFrame {
    JButton button1, button2;
    JLabel label1, label2, label3, label4, label41, label5, label6, label7, label8, label81;
    JTextField text1;
    JTextField text2;
    JTextField text3;
    int actionPower;    // активная мощность, кВт
    int reactPower;     // реактивная мощность, кВар
    int fullPower;      // полная мощность, кВА
    int current;        // ток, А
    double cosinus;     // cos ф
    double voltage;     // напряжение, кВ
    String outputText1, outputText2, outputText3;   // поля для вывода текста в label
    EHandler handler = new EHandler();              // слушатель

    public Calculation3(String s) {
        super(s);
        setLayout(new FlowLayout());
        button1 = new JButton("Расчитать");
        button2 = new JButton("Очистить");
        label1 = new JLabel("Введите активную мощность, кВт:");
        label2 = new JLabel("Введите реактивную мощность, кВар:");
        label3 = new JLabel("Введите напряжение(через '.'), кВ:");
        label4 = new JLabel("");
        label41 = new JLabel("");
        label5 = new JLabel("");
        label6 = new JLabel("");
        label7 = new JLabel("");
        label8 = new JLabel("");
        label81 = new JLabel("");
        text1 = new JTextField(10);
        text2 = new JTextField(10);
        text3 = new JTextField(10);

        // добавляем поля во фрейм
        add(label1);
        add(text1);
        add(label2);
        add(text2);
        add(label3);
        add(text3);
        add(button1);
        add(button2);
        add(label4);
        add(label41);
        add(label5);
        add(label6);
        add(label7);
        add(label8);
        add(label81);
        button1.addActionListener(handler);  // вешаем слушатель на кнопку button1
        button2.addActionListener(handler);  // вешаем слушатель на кнопку button2
    }

    public class EHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                if(e.getSource() == button1) { // если нажатая кнопка равна button1
                    actionPower = Integer.parseInt(text1.getText());
                    reactPower = Integer.parseInt(text2.getText());
                    voltage = Double.parseDouble(text3.getText());
                    fullPower = (int) Math.round(Math.sqrt((actionPower * actionPower) + (reactPower * reactPower)));
                    cosinus = (((double) actionPower) / ((double)fullPower));
                    current = (int) Math.round(fullPower / (1.73 * voltage));
                    outputText1 = "Полная мощность равна:  " + fullPower;
                    label4.setText(outputText1);
                    label41.setText("кВА");
                    label5.setText("___________________________________________");
                    DecimalFormat cs = new DecimalFormat("#.###");
                    outputText2 = "cos ф: " + cs.format(cosinus);
                    label6.setText(outputText2);
                    outputText3 = "Ток:  " + current;
                    label7.setText("<html><br><br></html>\n\n");
                    label8.setText(outputText3);
                    label81.setText("А");
                }

                if(e.getSource() == button2) { // если нажатая кнопка равна button2
                    text1.setText(null);
                    text2.setText(null);
                    text3.setText(null);
                    label4.setText("");
                    label41.setText("");
                    label5.setText("");
                    label6.setText("");
                    label7.setText("");
                    label8.setText("");
                    label81.setText("");
                }
            } catch(Exception ex) {
                JOptionPane.showMessageDialog(null, "Введите в поле число!");
            }
        }

    }
}
