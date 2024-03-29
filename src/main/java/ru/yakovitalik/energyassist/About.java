package ru.yakovitalik.energyassist;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 * Расчет реактивной мощности по активной и косинусу
 */

public class About extends JFrame {
    JButton button1, button2;
    JLabel label1;
    String text1 = "<html>\n" +
            "    <h2>Energy Assistant ver 1.2</h2>\n" +
            "    Программа позволяет выполнять расчеты электрических величин: <br>\n" +
            "    <br>\n" +
            "    1. Выбор мощности трансформатора по активной мощности и типу нагрузки;<br>\n" +
            "    2. Расчет полной мощности по активной и реактивной;<br>\n" +
            "    3. Расчет тока и коэффициента мощности по активной, реактивной мощности и напряжению;<br>\n" +
            "    4. Расчет величины нагрузки трансформатора по токам стороны 0,4кВ;<br>\n" +
            "    5. Расчет реактивной мощности по активной и коэффициенту мощности.<br>\n" +
            "    <br>\n" +
            "    Примечание:<br>\n" +
            "    Все величины нужно вводить целыми числами, без запятых кроме напряжения;<br>\n" +
            "    Напряжение вводится через точку а не запятую( Пример: 10.4)<br>\n" +
            "    <br>\n" +
            "    Для работы требуется версия Java не менее 1.8(Установлена по умолчанию)<br>\n" +
            "    <br>\n" +
            "    Автор: Виталий Яковлев, yakovitalik@mail.ru<br>\n" +
            "</html>";

    public About(String s) {
        super(s);
        setLayout(new FlowLayout());
        label1 = new JLabel(text1);

        add(label1);
    }
}

