package assistant;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 * Класс MainWindow - главное окно программы
 */

public class MainWindow extends JFrame {
    JButton button1, button2, button3, button4, button5;
    JLabel label1;

    EHandler handler = new EHandler();

    public MainWindow(String s) {
        super(s);
        setLayout(new FlowLayout());
        button1 = new JButton("Выбор мощности трансформатора");
        button2 = new JButton("Расчет полной мощности");
        button3 = new JButton("Расчет тока и коэфициента мощности");
        button4 = new JButton("Расчет величины загрузки трансформатора");
        button5 = new JButton("Расчет реактивной мощности");

        label1 = new JLabel("Выберите вариант расчета: ");
        label1.setFont(new Font("Verdana", Font.PLAIN, 13));

        // добавляем поля во фрейм
        add(label1);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);

        button1.addActionListener(handler);  // вешаем слушатель на кнопку button1
        button2.addActionListener(handler);  // вешаем слушатель на кнопку button2
        button3.addActionListener(handler);  // вешаем слушатель на кнопку button2
        button4.addActionListener(handler);  // вешаем слушатель на кнопку button2
        button5.addActionListener(handler);  // вешаем слушатель на кнопку button2
    }

    public class EHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            if(e.getSource() == button1) { // если нажатая кнопка равна button1
                CalcStart1.start();
            }

            if(e.getSource() == button2) { // если нажатая кнопка равна button2
                CalcStart2.start();
            }

            if(e.getSource() == button3) { // если нажатая кнопка равна button3
                CalcStart3.start();
            }

            if(e.getSource() == button4) { // если нажатая кнопка равна button4
                CalcStart4.start();
            }

            if(e.getSource() == button5) { // если нажатая кнопка равна button5
                CalcStart5.start();
            }
        }

    }
}
