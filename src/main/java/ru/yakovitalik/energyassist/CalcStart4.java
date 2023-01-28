package ru.yakovitalik.energyassist;

import javax.swing.JFrame;

/*
 * Стартует фрейм с расчетом загрузки трансформатора
 */

public class CalcStart4
{
    public static void start()
    {
        Calculation4 calc4 = new Calculation4("Расчет загрузки трансформатора");
        calc4.setVisible(true);									// делает окно видимым
        calc4.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);		// определяет что делает кнопка выхода
        calc4.setSize(410, 230);						// задает размеры окна
        calc4.setResizable(false);						// запрещает изменять размеры окна
        calc4.setLocationRelativeTo(null);						// размещает окно в центре экрана
    }
}
