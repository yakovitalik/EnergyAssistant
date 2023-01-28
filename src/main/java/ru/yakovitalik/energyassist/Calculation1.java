package ru.yakovitalik.energyassist;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 * Класс Calculation1
 */

public class Calculation1 extends JFrame {
    JButton button1, button2;
    JLabel label1, label2, label3, label4, label5;
    JTextField text1;
    String[] boxList = { "Коммунально-бытовая (cos = 0.93)", "Производственная (cos = 0.75)", "Смешання (cos = 0.85)" };
    JComboBox<String> сomboList1;
    int actionPower, fullPower, transPower;
    double cosinus = 0.93;          // по умолчанию косинус Фи равен 0.93, пока пользователь не выберет другое значение
    String choice, outputText1, outputText2;
    EHandler handler = new EHandler();

    public Calculation1(String s) {
        super(s);
        setLayout(new FlowLayout());
        button1 = new JButton("Расчитать");
        button2 = new JButton("Очистить");
        label1 = new JLabel("Введите активную мощность, кВт:");
        label2 = new JLabel("Выберете тип нагрузки:");
        label3 = new JLabel("");
        label4 = new JLabel("");
        label5 = new JLabel("");
        text1 = new JTextField(10);
        сomboList1 = new JComboBox<String>(boxList);

        // добавляем поля во фрейм
        сomboList1.setSelectedIndex(0);
        сomboList1.addActionListener(handler);
        add(label1);
        add(text1);
        add(label2);
        add(сomboList1);
        add(button1);
        add(button2);
        add(label3);
        add(label4);
        add(label5);
        button1.addActionListener(handler);  // вешаем слушатель на кнопку button1
        button2.addActionListener(handler);  // вешаем слушатель на кнопку button2
    }

    public class EHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                if(e.getSource() == сomboList1) {
                    JComboBox cb = (JComboBox)e.getSource();
                    choice = (String)cb.getSelectedItem();
                    switch(choice) {
                        case "Коммунально-бытовая (cos = 0.93)":
                            cosinus = 0.93;
                            break;
                        case "Производственная (cos = 0.75)":
                            cosinus = 0.75;
                            break;
                        case "Смешання (cos = 0.85)":
                            cosinus = 0.85;
                            break;
                        default:
                            cosinus = 0.75;
                    }
                }

                if(e.getSource() == button1) { // если нажатая кнопка равна button1
                    actionPower = Integer.parseInt(text1.getText());
                    fullPower = (int) Math.round(actionPower / cosinus);

                    // блок выбора требуемой мощности трансформатора
                    if(fullPower <= 10)
                        transPower = 10;
                    else if(fullPower <= 16)
                        transPower = 10;
                    else if(fullPower <= 25)
                        transPower = 25;
                    else if(fullPower <= 40)
                        transPower = 40;
                    else if(fullPower <= 63)
                        transPower = 63;
                    else if(fullPower <= 100)
                        transPower = 100;
                    else if(fullPower <= 160)
                        transPower = 160;
                    else if(fullPower <= 250)
                        transPower = 250;
                    else if(fullPower <= 400)
                        transPower = 400;
                    else if(fullPower <= 630)
                        transPower = 630;
                    else if(fullPower <= 1000)
                        transPower = 1000;
                    else if(fullPower <= 1250)
                        transPower = 1250;
                    else if(fullPower <= 1600)
                        transPower = 1600;
                    else if(fullPower <= 2500)
                        transPower = 2500;
                    else if(fullPower <= 4000)
                        transPower = 4000;
                    else if(fullPower <= 6300)
                        transPower = 6300;
                    else if(fullPower <= 10000)
                        transPower = 10000;
                    else if(fullPower <= 16000)
                        transPower = 16000;
                    else if(fullPower <= 25000)
                        transPower = 25000;
                    else if(fullPower <= 40000)
                        transPower = 40000;
                    else if(fullPower <= 63000)
                        transPower = 63000;

                    outputText1 = "Полная мощность нагрузки равна, кВА: " + fullPower;
                    label3.setText(outputText1);
                    label4.setText("_____________________________________________");
                    outputText2 = "Необходимо выбрать трансформатор, кВА: " + transPower;
                    label5.setText(outputText2);
                }

                if(e.getSource() == button2) { // если нажатая кнопка равна button2
                    text1.setText(null);
                    сomboList1.setSelectedItem(e);
                    label3.setText("");
                    label4.setText("");
                    label5.setText("");
                }
            } catch(Exception ex) {
                JOptionPane.showMessageDialog(null, "Введите в поле число!");
            }
        }

    }
}
