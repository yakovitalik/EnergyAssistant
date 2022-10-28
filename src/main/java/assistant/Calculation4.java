package assistant;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 * Расчет полной мощности по активной и реактивной
 */

public class Calculation4 extends JFrame {
    JButton button1, button2;
    JLabel label1, label2, label3, label4, label5, label6;
    JTextField text1;
    JTextField text2;
    JTextField text3;
    JTextField text4;
    String outputText1;

    // для расчета берется стандартное напряжение 230В
    static final int VOLTAGE = 230;

    int transPower;         // мощность трансформатора
    int currentA;           // ток по фазе А, Ампер
    int currentB;           // ток по фазе B, Ампер
    int currentC;           // ток по фазе C, Ампер
    int powerA;             // мощность по фазе A, Вт
    int powerB;             // мощность по фазе B, Вт
    int powerC;             // мощность по фазе C, Вт
    int totalPower;         // сумарная мощность по трем фазам, Вт
    int loading;            // загрузка трансформатора, в %

    EHandler handler = new EHandler();      // слушатель

    public Calculation4(String s) {
        super(s);
        setLayout(new FlowLayout());
        button1 = new JButton("Расчитать");
        button2 = new JButton("Очистить");
        label1 = new JLabel("Введите мощность трансформатора, кВА:");
        label2 = new JLabel("Введите ток по фазе А, А:");
        label3 = new JLabel("Введите ток по фазе B, А:");
        label4 = new JLabel("Введите ток по фазе C, А:");
        label5 = new JLabel("");
        label6 = new JLabel("");
        text1 = new JTextField(10);
        text2 = new JTextField(10);
        text3 = new JTextField(10);
        text4 = new JTextField(10);

        // добавляем элементы во фрейм
        add(label1);
        add(text1);
        add(label2);
        add(text2);
        add(label3);
        add(text3);
        add(label4);
        add(text4);
        add(button1);
        add(button2);
        add(label5);
        add(label6);
        button1.addActionListener(handler);  // вешаем слушатель на кнопку button1
        button2.addActionListener(handler);  // вешаем слушатель на кнопку button2
    }

    public class EHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                if(e.getSource() == button1) { // если нажатая кнопка равна button1
                    transPower = Integer.parseInt(text1.getText());
                    currentA = Integer.parseInt(text2.getText());
                    currentB = Integer.parseInt(text3.getText());
                    currentC = Integer.parseInt(text4.getText());
                    powerA = VOLTAGE * currentA;
                    powerB = VOLTAGE * currentB;
                    powerC = VOLTAGE * currentC;
                    totalPower = powerA + powerB + powerC;
                    loading = (int)Math.round(((double)(totalPower / 1000) / (double)(transPower)) * 100);
                    label5.setText("_____________________________________________");
                    outputText1 = "Загрузка трансформатора: " + loading + "%";
                    label6.setText(outputText1);
                }

                if(e.getSource() == button2) { // если нажатая кнопка равна button2
                    text1.setText(null);
                    text2.setText(null);
                    text3.setText(null);
                    text4.setText(null);
                    label5.setText("");
                    label6.setText("");
                }
            } catch(Exception ex) {
                JOptionPane.showMessageDialog(null, "Введите в поле целое число!");
            }
        }

    }
}
