package assistant;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 * Расчет реактивной мощности по активной и косинусу
 */

public class Calculation5 extends JFrame {
    JButton button1, button2;
    JLabel label1, label2, label3, label4;
    JTextField text1;
    JTextField text2;
    int actionPower;            // активная мощность, кВт
    int reactPower;             // реактивная мощность, кВар
    int fullPower;              // полная мощность, кВА
    double cosinusF;            // cos ф
    String outputText1;
    EHandler handler = new EHandler();

    public Calculation5(String s) {
        super(s);
        setLayout(new FlowLayout());
        button1 = new JButton("Расчитать");
        button2 = new JButton("Очистить");
        label1 = new JLabel("Введите активную мощность, кВт:");
        label2 = new JLabel("Введите коэффициент мощности (cos ф): ");
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
                    cosinusF = Double.parseDouble(text2.getText());
                    fullPower = (int) Math.round((double) actionPower / cosinusF);
                    reactPower = (int) Math.round(Math.sqrt((fullPower * fullPower) - (actionPower * actionPower)));
                    label3.setText("_____________________________________________");
                    outputText1 = "Реактивная мощность равна: " + reactPower + " кВар";
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
